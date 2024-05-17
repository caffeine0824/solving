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

        int T, N, M, a, b, loc, count;
        boolean[] check;
        boolean[][] path;
        Queue<Integer> queue;
        StringTokenizer st;

        T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            path = new boolean[N + 1][N + 1];
            for(boolean[] j : path)
                Arrays.fill(j, false);
            check = new boolean[N + 1];
            Arrays.fill(check, false);
            for(int j = 0; j < M; j++) {
                st = new StringTokenizer(br.readLine());
                a = Integer.parseInt(st.nextToken());
                b = Integer.parseInt(st.nextToken());
                path[a][b] = true;
                path[b][a] = true;
            }
            queue = new LinkedList<>();
            queue.add(1);
            check[1] = true;
            count = 0;
            while(true) {
                if(queue.isEmpty())
                    break;
                loc = queue.poll();
                for(int j = 1; j <= N; j++)
                    if(path[loc][j] && !check[j]) {
                        count++;
                        queue.add(j);
                        check[j] = true;
                    }
            }
            bw.write(count + "\n");
        }
        bw.flush();
    }
}