import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N, bestScore;
        int[] height, kill;
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        height = new int[N];
        kill = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++)
            height[i] = Integer.parseInt(st.nextToken());
        for(int i = 0; i < N; i++)
            for(int j = i + 1; j < N; j++) {
                if(height[j] > height[i])
                    break;
                else
                    kill[i]++;
            }
        bestScore = Integer.MIN_VALUE;
        for(int i = 0; i < N; i++)
            if(kill[i] > bestScore)
                bestScore = kill[i];
        bw.write(bestScore + "");
        bw.flush();
    }
}