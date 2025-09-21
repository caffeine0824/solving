import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N;
        String str;

        N = Integer.parseInt(br.readLine());
        str = "WelcomeToSMUPC";
        bw.write(str.charAt((N - 1) % str.length()));
        bw.flush();
    }
}