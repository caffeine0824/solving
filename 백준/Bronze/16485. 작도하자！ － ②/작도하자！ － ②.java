import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double c, b;
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        c = Double.parseDouble(st.nextToken());
        b = Double.parseDouble(st.nextToken());
        bw.write(c / b + "");
        bw.flush();
    }
}