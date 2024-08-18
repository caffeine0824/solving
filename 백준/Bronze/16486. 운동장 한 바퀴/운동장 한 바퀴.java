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

        double d1, d2;

        d1 = Double.parseDouble(br.readLine());
        d2 = Double.parseDouble(br.readLine());
        bw.write(d2 * 2 * 3.141592 + d1 * 2 + "");
        bw.flush();
    }
}