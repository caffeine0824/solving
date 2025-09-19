import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N, now;
        int[] num, line;
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        num = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++)
            num[i] = Integer.parseInt(st.nextToken());
        line = new int[N];
        for(int i = 0; i < N; i++) {
            now = i + 1;
            for(int j = 0; j < num[i]; j++)
                line[i - j] = line[i - (j + 1)];
            line[i - num[i]] = now;
        }
        for(int i = 0; i < N; i++)
            bw.write(line[i] + " ");
        bw.flush();
    }
}