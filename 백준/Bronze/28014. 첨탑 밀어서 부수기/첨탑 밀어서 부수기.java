import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N, count, before;
        int[] H;
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        H = new int[N];
        for(int i = 0; i < N; i++)
            H[i] = Integer.parseInt(st.nextToken());
        count = 0;
        before = 0;
        for(int i = 0; i < N; i++) {
            if(before <= H[i])
                count++;
            before = H[i];
        }
        bw.write(count + "");
        bw.flush();
    }
}