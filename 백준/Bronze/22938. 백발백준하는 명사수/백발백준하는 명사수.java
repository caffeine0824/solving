import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double X1, Y1, R1, X2, Y2, R2, distance;
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        X1 = Double.parseDouble(st.nextToken());
        Y1 = Double.parseDouble(st.nextToken());
        R1 = Double.parseDouble(st.nextToken());
        st = new StringTokenizer(br.readLine());
        X2 = Double.parseDouble(st.nextToken());
        Y2 = Double.parseDouble(st.nextToken());
        R2 = Double.parseDouble(st.nextToken());

        distance = Math.sqrt(Math.pow(X1 - X2, 2) + Math.pow(Y1 - Y2, 2));
        if(distance < R1 + R2)
            bw.write("YES");
        else
            bw.write("NO");
        bw.flush();
    }
}