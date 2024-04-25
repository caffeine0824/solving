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

        int N, count, gap;
        boolean no;
        String str;

        N = Integer.parseInt(br.readLine());
        count = 0;
        for(int i = 1; i <= N; i++) {
            str = i + "";
            if(str.length() < 2)
                count++;
            else {
                gap = Character.getNumericValue(str.charAt(0)) - Character.getNumericValue(str.charAt(1));
                no = false;
                for (int j = 2; j < str.length(); j++)
                    if(Character.getNumericValue(str.charAt(j - 1)) - Character.getNumericValue(str.charAt(j)) != gap) {
                        no = true;
                        break;
                    }
                if(!no)
                    count++;
            }
        }
        bw.write(count + "");
        bw.flush();
    }
}