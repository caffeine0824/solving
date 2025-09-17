import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N;
        double result, x1, y1, x2, y2, startX, startY;
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        result = 0;
        st = new StringTokenizer(br.readLine());
        startX = Double.parseDouble(st.nextToken());
        startY = Double.parseDouble(st.nextToken());
        x1 = startX;
        y1= startY;
        for(int i = 0; i < N; i++) {
            if(i == N - 1) {
                x2 = startX;
                y2 = startY;
            }
            else {
                st = new StringTokenizer(br.readLine());
                x2 = Double.parseDouble(st.nextToken());
                y2 = Double.parseDouble(st.nextToken());
            }
            result += Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
            x1 = x2;
            y1 = y2;
        }
        bw.write((int)result + "");
        bw.flush();
    }
}