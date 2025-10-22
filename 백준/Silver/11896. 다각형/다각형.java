import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long a, b, result;
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        a = Long.parseLong(st.nextToken());
        b = Long.parseLong(st.nextToken());
        result = 0;
        if(a < 4)
            a = 4;
        if(b > 3) {
            if (a % 2 == 1)
                a++;
            if (b % 2 == 1)
                b--;
            result = (((b - (a - 2)) / 2) * (a + b)) / 2;
        }
        bw.write(result + "");
        bw.flush();
    }
}
