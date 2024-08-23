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

        int N, M, result;
        int[][] cost;
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        cost = new int[2][M];
        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            cost[0][i] = Integer.parseInt(st.nextToken());
            cost[1][i] = Integer.parseInt(st.nextToken());
        }
        for(int i = 0; i < 2; i++) {
            Arrays.sort(cost[i]);
        }
        result = N / 6 * Integer.min(cost[0][0], cost[1][0] * 6);
        N %= 6;
        result += Integer.min(cost[0][0], cost[1][0] * N);
        bw.write(result + "");
        bw.flush();
    }
}