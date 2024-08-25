import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N, top, count, max;
        int[][] map, check;
        boolean run;
        boolean[] sectorCheck;
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        map = new int[N + 2][N + 2];
        sectorCheck = new boolean[100000];
        max = 0;
        top = 0;
        for(int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 1; j <= N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                top = Integer.max(top, map[i][j]);
            }
        }
        for(int rain = 0; rain < top; rain++) {
            run = true;
            check = new int[N + 2][N + 2];
            for(int i = 1; i <= N; i++)
                for(int j = 1; j <= N; j++)
                    if(map[i][j] > rain)
                        check[i][j] = i * N + j;
            while(run) {
                run = false;
                for (int i = 1; i <= N; i++)
                    for (int j = 1; j <= N; j++)
                        if(check[i][j] > 0) {
                            if(check[i][j + 1] > 0 && check[i][j + 1] != check[i][j]) {
                                check[i][j + 1] = Integer.min(check[i][j], check[i][j + 1]);
                                run = true;
                            }
                            if(check[i][j - 1] > 0 && check[i][j - 1] != check[i][j]) {
                                check[i][j - 1] = Integer.min(check[i][j], check[i][j - 1]);
                                run = true;
                            }
                            if(check[i + 1][j] > 0 && check[i + 1][j] != check[i][j]) {
                                check[i + 1][j] = Integer.min(check[i][j], check[i + 1][j]);
                                run = true;
                            }
                            if(check[i - 1][j] > 0 && check[i - 1][j] != check[i][j]) {
                                check[i - 1][j] = Integer.min(check[i][j], check[i - 1][j]);
                                run = true;
                            }
                        }
            }
            Arrays.fill(sectorCheck, false);
            count = 0;
            for(int i = 1; i <= N; i++)
                for(int j = 1; j <= N; j++)
                    if(!sectorCheck[check[i][j]] && check[i][j] != 0) {
                        sectorCheck[check[i][j]] = true;
                        count++;
                    }
            max = Integer.max(max, count);
        }

        bw.write(max + "");
        bw.flush();
    }
}
