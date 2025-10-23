import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N, score, now, bestScore, result;
        int[] graph;
        boolean[] graphCheck;

        N = Integer.parseInt(br.readLine());
        graph = new int[N + 1];
        for(int i = 1; i <= N; i++)
            graph[i] = Integer.parseInt(br.readLine());
        bestScore = Integer.MIN_VALUE;
        result = -1;
        for(int i = 1; i <= N; i++) {
            score = 0;
            now = i;
            graphCheck = new boolean[N + 1];
            while(!graphCheck[now]) {
                score++;
                graphCheck[now] = true;
                now = graph[now];
            }
            if(score > bestScore) {
                bestScore = score;
                result = i;
            }
        }
        bw.write(result + "");
        bw.flush();
    }
}