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

        int N, M;
        int[] buff;
        boolean run;
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        run = true;
        buff = new int[M];
        Arrays.fill(buff, 1);
        while (run) {
            for(int i = 0; i < M; i++)
                bw.write(buff[i] + " ");
            bw.write("\n");
            for(int i = M - 1; i >= 0; i--) {
                if(++buff[i] > N) {
                    if(i == 0) {
                        run = false;
                        break;
                    }
                    buff[i] = 1;
                }
                else
                    break;
            }
        }
        bw.flush();
    }
}