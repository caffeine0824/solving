import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N, M;
        String input;
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        for(int i = 0; i < N; i++) {
            input = br.readLine();
            for(int j = 0; j < M; j++) {
                bw.write(input.charAt((input.length() - 1) - j));
            }
            bw.write("\n");
        }
        bw.flush();
    }
}