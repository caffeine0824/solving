import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.*;

public class Main {
    static final double INF = Double.MAX_VALUE;
    static class Address {
        double x;
        double y;
        Address(double x, double y) {
            this.x = x;
            this.y = y;
        }
    }
    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double x, y, m1, m2, midX, midY;
        Address[] P;
        StringTokenizer st;

        P = new Address[3];
        for(int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            x = Double.parseDouble(st.nextToken());
            y = Double.parseDouble(st.nextToken());
            P[i] = new Address(x, y);
        }
        midX = P[1].x;
        midY = P[1].y;
        for(int i = 0; i < 3; i++) {
            P[i].x -= midX;
            P[i].y -= midY;
        }
        if(P[0].x == P[1].x)
            m1 = INF;
        else
            m1 = (P[0].y - P[1].y) / (P[0].x - P[1].x);
        if(P[1].x == P[2].x)
            m2 = INF;
        else
            m2 = (P[1].y - P[2].y) / (P[1].x - P[2].x);
        if(m1 == m2)
            bw.write("0");
        else if((P[0].x >= 0 && P[2].x >= 0) || (P[0].x < 0 && P[2].x < 0)) {
            if(m1 > m2)
                bw.write("1");
            else
                bw.write("-1");
        }
        else {
            if(m1 > m2)
                bw.write("-1");
            else
                bw.write("1");
        }
        bw.flush();
    }
}