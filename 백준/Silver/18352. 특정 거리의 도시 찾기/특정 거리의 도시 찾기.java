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

        int N, M, K, X, A, B;
        int[] dist;
        boolean run, out;
        StringTokenizer st;
        ArrayList<Integer>[] edge;

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        X = Integer.parseInt(st.nextToken());
        edge = new ArrayList[N + 1];
        for(int i = 0; i < N + 1; i++)
            edge[i] = new ArrayList<Integer>();
        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());
            edge[A].add(B);
        }
        dist = new int[N + 1];
        Arrays.fill(dist, 10000000);
        dist[X] = 0;
        run = true;
        while(run) {
            run = false;
            for(int i = 1; i <= N; i++)
                for(int j = 0; j < edge[i].size(); j++)
                    if(dist[edge[i].get(j)] > dist[i] + 1) {
                        dist[edge[i].get(j)] = dist[i] + 1;
                        run = true;
                    }
        }
        out = false;
        for(int i = 1; i <= N; i++)
            if(dist[i] == K) {
                bw.write(i + "\n");
                out = true;
            }
        if(!out)
            bw.write("-1");

        bw.flush();
    }
}
