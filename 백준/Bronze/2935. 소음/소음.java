import java.io.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String A, B, operator;

        A = br.readLine();
        operator = br.readLine();
        B = br.readLine();
        if(operator.equals("+")) {
            if(A.length() > B.length())
                for(int i = 0; i < A.length(); i++) {
                    if(i == A.length() - B.length())
                        bw.write("1");
                    else
                        bw.write(A.charAt(i));
                }
            else if(A.length() == B.length())
                bw.write(A.replace("1", "2"));
            else
                for(int i = 0; i < B.length(); i++) {
                    if(i == B.length() - A.length())
                        bw.write("1");
                    else
                        bw.write(B.charAt(i));
                }
        }
        if(operator.equals("*")) {
            bw.write("1");
            for(int i = 0; i < A.length() + B.length() - 2; i++)
                bw.write("0");
        }
        bw.flush();
    }
}