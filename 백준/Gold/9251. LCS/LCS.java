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

        int[][] check;
        String str1, str2;

        str1 = br.readLine();
        str2 = br.readLine();
        check = new int[str1.length() + 1][str2.length() + 1];
        for(int i = 1; i <= str1.length(); i++)
            for(int j = 1; j <= str2.length(); j++) {
                if(str1.charAt(i - 1) == str2.charAt(j - 1))
                    check[i][j] = check[i - 1][j - 1] + 1;
                else
                    check[i][j] = Integer.max(check[i - 1][j], check[i][j - 1]);
            }
        bw.write(check[str1.length()][str2.length()] + "");
        bw.flush();
    }
}