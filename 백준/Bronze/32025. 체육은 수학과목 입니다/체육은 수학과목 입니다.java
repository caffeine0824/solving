import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int H, W;

        H = Integer.parseInt(br.readLine());
        W = Integer.parseInt(br.readLine());
        bw.write(Math.min(H, W) * 50 + "");
        bw.flush();
    }
}