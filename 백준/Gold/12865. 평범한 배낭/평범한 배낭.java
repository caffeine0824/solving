import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    static class Item {
        Item(int W, int V) {
            this.W = W;
            this.V = V;
        }
        int W, V;
    }
    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N, K;
        int[][] dp;
        Item[] item;
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        item = new Item[N];
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            item[i] = new Item(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }
        dp = new int[N][K + 1];
        for(int i = 0; i <= K; i++) {
            if(i < item[0].W)
                dp[0][i] = 0;
            else
                dp[0][i] = item[0].V;
        }
        for(int i = 1; i < N; i++) {
            for(int j = 0; j <= K; j++) {
                if(j == 0)
                    dp[i][j] = 0;
                else if(j < item[i].W)
                    dp[i][j] = dp[i - 1][j];
                else
                    dp[i][j] = Integer.max(dp[i - 1][j], item[i].V + dp[i - 1][j - item[i].W]);
            }
        }
        bw.write(dp[N - 1][K] + "");
        bw.flush();
    }
}