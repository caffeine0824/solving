import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N, a, b, temp;

        N = Integer.parseInt(br.readLine());

        a = 1;
        b = 2;
        for(int i = 1; i < N; i++) {
            a += b;
            temp = a;
            a = b;
            b = temp;
        }
        bw.write(a + "");
        bw.flush();
    }
}