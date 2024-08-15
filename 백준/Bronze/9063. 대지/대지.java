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

        int N, output;
        int[][] marble;
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        marble = new int[2][N];
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 2; j++)
                marble[j][i] = Integer.parseInt(st.nextToken());
        }
        for(int i = 0; i < 2; i++)
            Arrays.sort(marble[i]);
        output = (marble[0][N - 1] - marble[0][0]) * (marble[1][N - 1] - marble[1][0]);
        bw.write(output + "");
        bw.flush();
    }
}