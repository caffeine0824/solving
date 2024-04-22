import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N, m, M, T, R, count, now, time;
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        T = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());
        count = 0;
        time = 0;
        now = m;
        while(count < N && M - m >= T) {
            time++;
            if(now + T <= M) {
                count++;
                now += T;
            }
            else {
                now -= R;
                if(now < m)
                    now = m;
            }
        }
        bw.write((count == 0 ? -1 : time) + "");
        bw.flush();
    }
}