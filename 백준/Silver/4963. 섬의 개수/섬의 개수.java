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

        int w, h, input, count, x, y;
        int[][] field;
        boolean run;
        StringTokenizer st;
        HashSet<Integer> set;

        while(true) {
            st = new StringTokenizer(br.readLine());
            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());
            if(w == 0 && h == 0)
                break;
            field = new int[h + 2][w + 2];
            count = 0;
            for(int i = 0; i < h; i++) {
                st = new StringTokenizer(br.readLine());
                for(int j = 0; j < w; j++) {
                    input = Integer.parseInt(st.nextToken());
                    if(input != 0)
                        field[i + 1][j + 1] = ++count;
                }
            }
            run = true;
            while(run) {
                run = false;
                for(int i = 0; i < h; i++)
                    for(int j = 0; j < w; j++) {
                        y = i + 1;
                        x = j + 1;
                        if(field[y][x] != 0)
                            for(int k = -1; k < 2; k++)
                                for(int l = -1; l < 2; l++)
                                    if(field[y + k][x + l] > field[y][x]) {
                                        field[y][x] = field[y + k][x + l];
                                        run = true;
                                    }
                    }
            }
            set = new HashSet<>();
            for(int i = 0; i < h; i++)
                for(int j = 0; j < w; j++)
                    if(field[i + 1][j + 1] != 0)
                        set.add(field[i + 1][j + 1]);
            bw.write(set.size() + "\n");
        }
        bw.flush();
    }
}