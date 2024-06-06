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

        long A, B, C, result, i, a;
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        A = Long.parseLong(st.nextToken());
        B = Long.parseLong(st.nextToken());
        C = Long.parseLong(st.nextToken());
        result = 1;
        while(B > 0) {
            a = A;
            i = 1;
            while(B - (i * 2) >= 0) {
                a *= a;
                a %= C;
                i *= 2;
            }
            B -= i;
            result *= a;
            result %= C;
        }
        bw.write(result + "");
        bw.flush();
    }
}