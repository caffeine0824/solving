import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean find;
        String input;

        find = false;
        for(int i = 1; i <= 5; i++) {
            input = br.readLine();
            if(input.contains("FBI")) {
                bw.write(i + " ");
                find = true;
            }
        }
        if(!find)
            bw.write("HE GOT AWAY!");
        bw.flush();
    }
}
