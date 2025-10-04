import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int A, B, C, M, work, burn;
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        burn = 0;
        work = 0;
        for(int i = 0; i < 24; i++) {
            if((burn + A) <= M) {
                burn += A;
                work += B;
            }
            else {
                burn -= C;
                if(burn < 0)
                    burn = 0;
            }
        }
        bw.write(work + "");
        bw.flush();
    }
}