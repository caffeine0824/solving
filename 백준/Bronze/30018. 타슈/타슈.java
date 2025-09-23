import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N, count;
        int[] a, b;
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        a = new int[N];
        b = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++)
            a[i] = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++)
            b[i] = Integer.parseInt(st.nextToken());
        count = 0;
        for(int i = 0; i < N; i++)
            if(a[i] > b[i])
                count += a[i] - b[i];
        bw.write(count + "");
        bw.flush();
    }
}