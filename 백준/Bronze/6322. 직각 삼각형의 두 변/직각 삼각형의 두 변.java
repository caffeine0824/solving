import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static final int INF = 100001;
    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int triangleCase;
        double a, b, c, result;
        StringTokenizer st;

        triangleCase = 1;
        while(true) {
            st = new StringTokenizer(br.readLine());
            a = Double.parseDouble(st.nextToken());
            b = Double.parseDouble(st.nextToken());
            c = Double.parseDouble(st.nextToken());
            if(a == 0 || b == 0 || c == 0)
                break;
            if(a == -1) {
                bw.write("Triangle #" + triangleCase + "\n");
                result = Math.sqrt(c * c - b * b);
                if(c > b)
                    bw.write(String.format("a = %.3f\n\n", result));
                else
                    bw.write("Impossible.\n\n");
            }
            else if(b == -1) {
                bw.write("Triangle #" + triangleCase + "\n");
                result = Math.sqrt(c * c - a * a);
                if(c > a)
                    bw.write(String.format("b = %.3f\n\n", result));
                else
                    bw.write("Impossible.\n\n");
            }
            else if(c == -1) {
                bw.write("Triangle #" + triangleCase + "\n");
                result = Math.sqrt(a * a + b * b);
                bw.write(String.format("c = %.3f\n\n", result));
            }
            triangleCase++;
        }
        bw.flush();
    }
}