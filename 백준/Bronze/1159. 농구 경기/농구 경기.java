import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

       int N;
       int[] count;
       boolean PREDAJA;

       N = Integer.parseInt(br.readLine());
       count = new int[26];
       for(int i = 0; i < N; i++)
           count[(int)(br.readLine().charAt(0) - 97)]++;
       PREDAJA = true;
       for(int i = 0; i < 26; i++)
           if(count[i] >= 5) {
               bw.write((char) (i + 97) + "");
               PREDAJA = false;
           }
       if(PREDAJA)
           bw.write("PREDAJA");
       bw.flush();
    }
}