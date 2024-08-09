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

        int T, n, count;
        double x1, y1, x2, y2;
        double[][] c;
        boolean[] check;
        StringTokenizer st;

        T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            x1 = Double.parseDouble(st.nextToken());
            y1 = Double.parseDouble(st.nextToken());
            x2 = Double.parseDouble(st.nextToken());
            y2 = Double.parseDouble(st.nextToken());
            n = Integer.parseInt(br.readLine());
            c = new double[n][3];
            for(int j = 0; j < n; j++) {
                st = new StringTokenizer(br.readLine());
                for(int k = 0; k < 3; k++)
                    c[j][k] = Double.parseDouble(st.nextToken());
            }
            check = new boolean[2];
            count = 0;
            for(int j = 0; j < n; j++) {
                Arrays.fill(check, false);
                if(Math.sqrt(Math.pow(x1 - c[j][0], 2) + Math.pow(y1 - c[j][1], 2)) < c[j][2])
                    check[0] = true;
                if(Math.sqrt(Math.pow(x2 - c[j][0], 2) + Math.pow(y2 - c[j][1], 2)) < c[j][2])
                    check[1] = true;
                if((check[0] && !check[1]) || (!check[0] && check[1]))
                    count++;
            }
            bw.write(count + "\n");
        }
        bw.flush();
    }
}