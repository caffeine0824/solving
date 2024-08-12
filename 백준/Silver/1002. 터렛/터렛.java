import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T;
        double x1, y1, r1, x2, y2, r2, dist;
        StringTokenizer st;

        T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            x1 = Double.parseDouble(st.nextToken());
            y1 = Double.parseDouble(st.nextToken());
            r1 = Double.parseDouble(st.nextToken());
            x2 = Double.parseDouble(st.nextToken());
            y2 = Double.parseDouble(st.nextToken());
            r2 = Double.parseDouble(st.nextToken());
            dist = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
            if(dist == 0) {
                if(r1 == r2)
                    bw.write("-1\n");
                else
                    bw.write("0\n");
            }
            else if(dist == r1 + r2 || r1 == dist + r2 || r2 == dist + r1)
                bw.write("1\n");
            else if(dist > r1 + r2 || r1 > dist + r2 || r2 > dist + r1)
                bw.write("0\n");
            else
                bw.write("2\n");
        }
        bw.flush();
    }
}