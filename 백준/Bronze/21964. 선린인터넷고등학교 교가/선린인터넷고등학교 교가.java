import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N;
        String S;

        N = Integer.parseInt(br.readLine());
        S = br.readLine();
        bw.write(S.substring(N - 5));
        bw.flush();
    }
}