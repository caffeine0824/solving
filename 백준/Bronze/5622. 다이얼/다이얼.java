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

        int time;
        String input;

        input = br.readLine();
        time = 0;
        for(int i = 0; i < input.length(); i++) {
            if(input.charAt(i) < 68)
                time += 3;
            else if(input.charAt(i) < 71)
                time += 4;
            else if(input.charAt(i) < 74)
                time += 5;
            else if(input.charAt(i) < 77)
                time += 6;
            else if(input.charAt(i) < 80)
                time += 7;
            else if(input.charAt(i) < 84)
                time += 8;
            else if(input.charAt(i) < 87)
                time += 9;
            else
                time += 10;
        }
        bw.write(time + "");
        bw.flush();
    }
}