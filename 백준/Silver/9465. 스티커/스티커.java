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

        int T, n;
        int[][] stk;
        StringTokenizer st;

        T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++) {
            n = Integer.parseInt(br.readLine());
            stk = new int[2][n];
            for(int j = 0; j < 2; j++) {
                st = new StringTokenizer(br.readLine());
                for(int k = 0; k < n; k++)
                    stk[j][k] = Integer.parseInt(st.nextToken());
            }
            if(n > 1) {
                stk[0][1] += stk[1][0];
                stk[1][1] += stk[0][0];
                if(n > 2) {
                    for (int j = 2; j < n; j++) {
                        stk[0][j] += Integer.max(stk[1][j - 1], Integer.max(stk[0][j - 2], stk[1][j - 2]));
                        stk[1][j] += Integer.max(stk[0][j - 1], Integer.max(stk[0][j - 2], stk[1][j - 2]));
                    }
                }
            }
            bw.write(Integer.max(stk[0][n - 1], stk[1][n - 1]) + "\n");
        }
        bw.flush();
    }
}
