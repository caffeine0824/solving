import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N;
        int[] seq;

        N = Integer.parseInt(br.readLine());
        seq = new int[N];
        seq[0] = 1;
        for(int i = 1; i < N - 1; i++) {
            if(seq[i - 1] == 1)
                seq[i] = 2;
            else if(seq[i - 1] == 2)
                seq[i] = 1;
        }
        if(N % 2 == 1)
            seq[N - 1] = 3;
        else
            seq[N - 1] = 2;
        for(int i = 0; i < N; i++)
            bw.write(seq[i] + " ");
        bw.flush();
    }
}