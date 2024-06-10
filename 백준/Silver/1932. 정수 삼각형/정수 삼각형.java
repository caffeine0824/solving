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
        int[][] tri;
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        tri = new int[N][N];
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < i + 1; j++) {
                tri[i][j] = Integer.parseInt(st.nextToken());
                if (i > 0) {
                    if (j > 0 && j < i)
                        tri[i][j] += Math.max(tri[i - 1][j - 1], tri[i - 1][j]);
                    else if (j == 0)
                        tri[i][j] += tri[i - 1][j];
                    else if (j == i)
                        tri[i][j] += tri[i - 1][j - 1];
                }
            }
        }
        Arrays.sort(tri[N - 1]);
        bw.write(tri[N - 1][N - 1] + "");
        bw.flush();
    }
}