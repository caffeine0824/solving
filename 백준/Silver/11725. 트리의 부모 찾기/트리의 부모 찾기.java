import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N, a, b, token, child;
        int[] parent;
        ArrayList<Integer>[] edge;
        Queue<Integer> queue;
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        edge = new ArrayList[N + 1];
        for(int i = 1; i <= N; i++)
            edge[i] = new ArrayList<>();
        for(int i = 1; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            edge[a].add(b);
            edge[b].add(a);
        }
        parent = new int[N + 1];
        queue = new LinkedList<>();
        queue.add(1);
        while(!queue.isEmpty()) {
            token = queue.poll();
            queue.addAll(edge[token]);
            for(int i = 0; i < edge[token].size(); i++) {
                child = edge[token].get(i);
                parent[child] = token;
                for(int j = 0; j < edge[child].size(); j++)
                    if(edge[child].get(j) == token)
                        edge[child].remove(j);
            }
            edge[token].clear();
        }
        for(int i = 2; i <= N; i++)
            bw.write(parent[i] + "\n");
        bw.flush();
    }
}
