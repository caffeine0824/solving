import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        bw.write(input.charAt(0) + "");
        for(int i = 1; i < input.length(); i++)
            if(input.charAt(i) == '-')
                bw.write(input.charAt(i + 1) + "");
        bw.flush();
    }
}