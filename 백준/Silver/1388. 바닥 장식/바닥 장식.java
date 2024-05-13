import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N, M, count;
        int[][] tile;
        boolean[][] check;
        String tileStr;
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        check = new boolean[N][M];
        for (boolean[] i : check)
            Arrays.fill(i, false);
        tile = new int[N][M];
        for (int i = 0; i < N; i++) {
            tileStr = br.readLine();
            for (int j = 0; j < M; j++) {
                if (tileStr.charAt(j) == '-')
                    tile[i][j] = 0;
                else
                    tile[i][j] = 1;
            }
        }
        count = 0;
        for (int i = 0; i < N; i++)
            for (int j = 0; j < M; j++)
                if (!check[i][j]) {
                    if (tile[i][j] == 0) {
                        count++;
                        int k = 0;
                        while (tile[i][j + k] == 0) {
                            check[i][j + k++] = true;
                            if (j + k >= M)
                                break;
                        }
                    }
                    if (tile[i][j] == 1) {
                        count++;
                        int k = 0;
                        while (tile[i + k][j] == 1) {
                            check[i + k++][j] = true;
                            if (i + k >= N)
                                break;
                        }
                    }
                }
        bw.write(count + "");
        bw.flush();
    }
}