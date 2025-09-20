import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count;
        String input;
        char nowChar;

        input = br.readLine();
        count = 0;
        for(int i = 0; i < input.length(); i++) {
            nowChar = input.charAt(i);
            if(nowChar == 'a' || nowChar == 'e' || nowChar == 'i' || nowChar == 'o' || nowChar == 'u')
                count++;
        }
        bw.write(count + "");
        bw.flush();
    }
}
