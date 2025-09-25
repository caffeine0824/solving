import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N, see, count;
        int[] h;

        N = Integer.parseInt(br.readLine());
        h = new int[N];
        for(int i = 0; i < N; i++)
            h[i] = Integer.parseInt(br.readLine());
        see = Integer.MIN_VALUE;
        count = 0;
        for(int i = N - 1; i >= 0; i--)
            if(h[i] > see) {
                see = h[i];
                count++;
            }
        bw.write(count + "");
        bw.flush();
    }
}