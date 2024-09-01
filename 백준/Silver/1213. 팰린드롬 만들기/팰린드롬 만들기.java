import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean make;
        String input;
        int[] count;
        char[] output;

        input = br.readLine();
        count = new int[26];
        for(int i = 0; i < input.length(); i++)
            count[input.charAt(i) - 65]++;
        output = new char[input.length()];
        make = true;
        for(int i = 0; i < output.length / 2; i++) {
            for(int j = 0; j < 26; j++)
                if(count[j] > 1) {
                    count[j] -= 2;
                    output[i] = (char)(j + 65);
                    output[output.length - 1 - i] = (char)(j + 65);
                    break;
                }
            if(output[i] == 0) {
                make = false;
                break;
            }
        }
        if(make) {
            if (output.length % 2 == 1)
                for (int i = 0; i < 26; i++)
                    if(count[i] == 1)
                        output[output.length / 2] = (char)(i + 65);
            bw.write(new String(output));
        }
        else
            bw.write("I'm Sorry Hansoo");
        bw.flush();
    }
}
