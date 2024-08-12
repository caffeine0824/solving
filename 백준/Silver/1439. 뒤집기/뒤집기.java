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

        int memo, count;
        int[] str;
        String S;

        S = br.readLine();
        str = new int[S.length()];
        memo = -1;
        count = 0;
        for(int i = 0; i < S.length(); i++) {
            str[i] = S.charAt(i) - 48;
            if(memo != str[i]) {
                count++;
                memo = str[i];
            }
        }
        bw.write(count / 2 + "");
        bw.flush();
    }
}