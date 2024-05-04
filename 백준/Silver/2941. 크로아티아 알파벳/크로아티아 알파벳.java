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

        int count;
        String input;

        input = br.readLine();
        count = 0;
        for(int i = 0; i < input.length(); i++)
            if(input.charAt(i) > 96 && input.charAt(i) < 123) {
                count++;
                if(input.startsWith("dz=", i))
                    i += 2;
                if(input.startsWith("lj", i) || input.startsWith("nj", i))
                    i++;
            }
        bw.write(count + "");
        bw.flush();
    }
}