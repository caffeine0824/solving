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

        int n, output;

        n = Integer.parseInt(br.readLine());
        if(n == 1 || n == 3)
            output = -1;
        else {
            output = n / 5;
            n -= output * 5;
            if(n % 2 != 0) {
                n += 5;
                output--;
            }
            output += n / 2;
        }
        bw.write(output + "");
        bw.flush();
    }
}
