import java.io.*;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N, me, mesu;
        Integer[] other;

        N = Integer.parseInt(br.readLine());
        me = Integer.parseInt(br.readLine());
        other = new Integer[N];
        other[0] = 0;
        for(int i = 1; i < N; i++)
            other[i] = Integer.parseInt(br.readLine());
        Arrays.sort(other, Collections.reverseOrder());
        mesu = 0;
        while (me <= other[0]) {
            other[0]--;
            me++;
            mesu++;
            Arrays.sort(other, Collections.reverseOrder());
        }
        bw.write(mesu + "");
        bw.flush();
    }
}