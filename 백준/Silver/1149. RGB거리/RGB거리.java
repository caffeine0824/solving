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

        int N;
        int[][] cost;
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        cost = new int[N][3];
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 3; j++)
                cost[i][j] = Integer.parseInt(st.nextToken());
            if(i > 0)
                for(int j = 0; j < 3; j++)
                    cost[i][j] += Math.min(cost[i - 1][(j + 1) % 3], cost[i - 1][(j + 2) % 3]);
        }
        Arrays.sort(cost[N - 1]);
        bw.write(cost[N - 1][0] + "");
        bw.flush();
    }
}