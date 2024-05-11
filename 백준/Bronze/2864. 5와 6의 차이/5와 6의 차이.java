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

        int maxA, maxB, minA, minB;
        String A, B;
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        A = st.nextToken();
        B = st.nextToken();
        maxA = Integer.parseInt(A.replace("5", "6"));
        maxB = Integer.parseInt(B.replace("5", "6"));
        minA = Integer.parseInt(A.replace("6", "5"));
        minB = Integer.parseInt(B.replace("6", "5"));
        bw.write((minA + minB) + " " + (maxA + maxB));
        bw.flush();
    }
}