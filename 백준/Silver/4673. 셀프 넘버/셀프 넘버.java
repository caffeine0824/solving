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

        int dN;
        String dNStr;
        boolean[] check;

        check = new boolean[10001];
        Arrays.fill(check, true);
        for(int i = 1; i < 10001; i++)
            if(check[i]) {
                dN = i;
                while (dN < 10001) {
                    dNStr = dN + "";
                    for (int j = 0; j < dNStr.length(); j++)
                        dN += Character.getNumericValue(dNStr.charAt(j));
                    if (dN < 10001)
                        check[dN] = false;
                }
            }
        for(int i = 1; i < 10001; i++)
            if(check[i])
                bw.write(i + "\n");
        bw.flush();
    }
}