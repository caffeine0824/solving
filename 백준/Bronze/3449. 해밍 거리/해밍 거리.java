import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T, distance;
        String A, B;

        T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++) {
            A = br.readLine();
            B = br.readLine();
            distance = 0;
            for(int j = 0; j < A.length(); j++)
                if(A.charAt(j) != B.charAt(j))
                    distance++;
            bw.write("Hamming distance is " + distance + ".\n");
        }
        bw.flush();
    }
}