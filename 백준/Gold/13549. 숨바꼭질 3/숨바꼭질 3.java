import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static final int INF = 100001;
    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N, K, max, token;
        int[] graph;
        StringTokenizer st;
        Queue<Integer> queue;

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        max = N + K + 1;
        graph = new int[max];
        Arrays.fill(graph, INF);
        graph[N] = 0;
        queue = new PriorityQueue<>();
        queue.add(N);
        while(!queue.isEmpty()) {
            token = queue.poll();
            if(token * 2 < max && graph[token * 2] > graph[token]) {
                graph[token * 2] = graph[token];
                queue.add(token * 2);
            }
            if(token > 0 && graph[token - 1] > graph[token] + 1) {
                graph[token - 1] = graph[token] + 1;
                queue.add(token - 1);
            }
            if(token < max - 1 && graph[token + 1] > graph[token] + 1) {
                graph[token + 1] = graph[token] + 1;
                queue.add(token + 1);
            }
        }
        bw.write(graph[K] + "");
        bw.flush();
    }
}