import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N;
        double W, H, dia, input;
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        W = Double.parseDouble(st.nextToken());
        H = Double.parseDouble(st.nextToken());
        dia = Math.sqrt(W * W + H * H);
        for(int i = 0; i < N; i++) {
            input = Double.parseDouble(br.readLine());
            if(input <= dia)
                bw.write("DA\n");
            else 
                bw.write("NE\n");
        }
        bw.flush();
    }
}