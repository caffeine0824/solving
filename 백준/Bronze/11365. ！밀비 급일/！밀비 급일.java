import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String passcode;

        while(!(passcode = br.readLine()).equals("END")) {
            for(int i = passcode.length() - 1; i >=0; i-- )
                bw.write(passcode.charAt(i) + "");
            bw.write("\n");
        }
        bw.flush();
    }
}