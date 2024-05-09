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

        int T, L, P, V, result;
        String input;
        StringTokenizer st;

        T = 1;
        while(true) {
            input = br.readLine();
            if(input.equals("0 0 0"))
                break;
            st = new StringTokenizer(input);
            L = Integer.parseInt(st.nextToken());
            P = Integer.parseInt(st.nextToken());
            V = Integer.parseInt(st.nextToken());
            result = (V / P) * L;
            V %= P;
            if(V < L)
                result += V;
            else
                result += L;
            bw.write("Case " + T++ + ": " + result + "\n");
        }
        bw.flush();
    }
}