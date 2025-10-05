import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N, all;
        int[] a;
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        a = new int[N];
        all = 0;
        for(int i = 0; i < N; i++) {
            a[i] = Integer.parseInt(st.nextToken());
            all += a[i];
        }
        Arrays.sort(a);
        if(all % 2 == 1)
            for (int i = 0; i < N; i++)
                if (a[i] % 2 == 1) {
                    all -= a[i];
                    break;
                }
        bw.write(all + "");
        bw.flush();
    }
}