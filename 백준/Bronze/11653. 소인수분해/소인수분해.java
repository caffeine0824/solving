import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N;

        N = Integer.parseInt(br.readLine());
        while(N > 1)
            for(int i = 2; i <= N; i++)
                if(N % i == 0) {
                    N /= i;
                    bw.write(i + "\n");
                    break;
                }
        bw.flush();
    }
}