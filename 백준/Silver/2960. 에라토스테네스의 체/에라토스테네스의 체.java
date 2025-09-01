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

        int N, K, count, result;
        boolean[] chart;
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        chart = new boolean[N + 1];
        chart[0] = true;
        chart[1] = true;
        count = 0;
        result = 0;
        for(int i = 2; i <= N; i++) {
            for(int j = 1; j * i <= N; j++) {
                if(!chart[i * j]) {
                    chart[i * j] = true;
                    count++;
                    if(count == K) {
                        result = i * j;
                        break;
                    }
                }
            }
            if(count == K)
                break;
        }

        bw.write(result + "");
        bw.flush();
    }
}