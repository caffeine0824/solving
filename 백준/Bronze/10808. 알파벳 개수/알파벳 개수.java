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

        int[] count = new int[26];
        String input = br.readLine();
        for(int i = 0; i < input.length(); i++)
            count[input.charAt(i) - 97]++;
        for(int i = 0; i < 26; i++)
            bw.write(count[i] + " ");
        bw.flush();
    }
}