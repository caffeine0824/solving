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

        int N, count;
        boolean group;
        boolean[] check;
        char now;
        String input;

        N = Integer.parseInt(br.readLine());
        count = 0;
        check = new boolean[26];
        now = ' ';
        for(int i = 0; i < N; i++) {
            input = br.readLine();
            group = true;
            Arrays.fill(check, false);
            for(int j = 0; j < input.length(); j++) {
                if(!check[input.charAt(j) - 97] || input.charAt(j) == now) {
                    check[input.charAt(j) - 97] = true;
                    now = input.charAt(j);
                }
                else  {
                    group = false;
                    break;
                }
            }
            if(group)
                count++;
        }
        bw.write(count + "");
        bw.flush();
    }
}