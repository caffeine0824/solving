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

        int N, n1, n2, count;

        N = Integer.parseInt(br.readLine());
        n1 = N;
        count = 0;
        do {
            n2 = (n1 / 10 + n1 % 10) % 10 + (n1 % 10) * 10;
            n1 = n2;
            count++;
        } while(N != n2);
        bw.write(count + "");
        bw.flush();
    }
}