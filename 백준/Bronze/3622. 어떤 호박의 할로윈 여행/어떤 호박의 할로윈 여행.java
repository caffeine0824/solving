import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int A, a, B, b, P;
        boolean result;
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        A = Integer.parseInt(st.nextToken());
        a = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        P = Integer.parseInt(st.nextToken());

        if(P < A || P < B)
            result = false;
        else if(a >= B || b >= A)
            result = true;
        else result = A + B <= P;

        if(result)
            bw.write("Yes");
        else
            bw.write("No");
        bw.flush();
    }
}