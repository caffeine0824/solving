import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n, a, b, temp;

        n = Integer.parseInt(br.readLine());
        a = 1;
        b = 1;
        for(int i = 2; i < n; i++) {
            temp = a;
            a = b;
            b += temp;
        }
        bw.write(b + " " + (n - 2));
        bw.flush();
    }
}
