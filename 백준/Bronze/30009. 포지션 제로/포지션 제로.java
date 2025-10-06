import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N, X, Y, R, A, B;
        int[] T;
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        X = Integer.parseInt(st.nextToken());
        Y = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());
        T = new int[N];
        for(int i = 0; i < N; i++)
            T[i] = Integer.parseInt(br.readLine());
        A = 0;
        B = 0;
        for(int i = 0; i < N; i++) {
            if(T[i] > X - R && T[i] < X + R)
                A++;
            else if(T[i] == X - R || T[i] == X + R)
                B++;
        }
        bw.write(A + " " + B);
        bw.flush();
    }
}