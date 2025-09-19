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

        int N, count, drinkedMilk;
        int[] store;
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        store = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++)
            store[i] = Integer.parseInt(st.nextToken());
        count = 0;
        drinkedMilk = 2;
        for(int i = 0; i < N; i++)
            if(store[i] == (drinkedMilk + 1) % 3) {
                count++;
                drinkedMilk = store[i];
            }
        bw.write(count + "");
        bw.flush();
    }
}