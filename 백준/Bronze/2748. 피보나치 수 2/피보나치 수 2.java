import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n;
        long a, b, temp;

        n = Integer.parseInt(br.readLine());
        a = 0;
        b = 1;
        for(int i = 1; i < n; i++) {
            temp = a;
            a = b;
            b += temp;
        }
        bw.write(b + "");
        bw.flush();
    }
}