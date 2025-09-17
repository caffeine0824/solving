import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N;
        String input;

        N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++) {
            input = br.readLine();
            bw.write((i + 1) + ". " + input + "\n");
        }
        bw.flush();
    }
}
