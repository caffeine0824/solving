import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double x, y;
        StringTokenizer st;

        while(true) {
            st = new StringTokenizer(br.readLine());
            x = Double.parseDouble(st.nextToken());
            y = Double.parseDouble(st.nextToken());
            if(x > 0 && y > 0)
                bw.write("Q1\n");
            else if(x < 0 && y > 0)
                bw.write("Q2\n");
            else if(x < 0 && y < 0)
                bw.write("Q3\n");
            else if(x > 0 && y < 0)
                bw.write("Q4\n");
            else
                bw.write("AXIS\n");
            if(x == 0 && y == 0)
                break;
        }
        bw.flush();
    }
}