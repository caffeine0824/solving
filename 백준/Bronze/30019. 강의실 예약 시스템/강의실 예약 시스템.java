import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N, M, k, s, e;
        int[] room;
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        room = new int[N];
        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            k = Integer.parseInt(st.nextToken());
            s = Integer.parseInt(st.nextToken());
            e = Integer.parseInt(st.nextToken());
            if(room[k - 1] <= s) {
                bw.write("YES\n");
                room[k - 1] = e;
            }
            else
                bw.write("NO\n");
        }
        bw.flush();
    }
}