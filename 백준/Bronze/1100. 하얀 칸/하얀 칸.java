import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count;
        String input;

        count = 0;
        for(int i = 0; i < 8; i++) {
            input = br.readLine();
            for(int j = 0; j < 4; j++)
                if(input.charAt(j * 2 + i % 2) == 'F')
                    count++;
        }
        bw.write(count + "");
        bw.flush();
    }
}