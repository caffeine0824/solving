import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double K, D1, D2, result;
        StringTokenizer st;

        K = Double.parseDouble(br.readLine());
        st = new StringTokenizer(br.readLine());
        D1 = Double.parseDouble(st.nextToken());
        D2 = Double.parseDouble(st.nextToken());

        result = Math.pow(K, 2) - Math.pow(((D1 - D2) / 2), 2);
        bw.write(result + "");
        bw.flush();
    }
}