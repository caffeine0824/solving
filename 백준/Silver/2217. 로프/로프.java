import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N, max;
        int[] rope;

        N = Integer.parseInt(br.readLine());
        rope = new int[N];
        for(int i = 0; i < N; i++)
            rope[i] = Integer.parseInt(br.readLine());
        Arrays.sort(rope);
        max = Integer.MIN_VALUE;
        for(int i = 0; i < N; i++)
            max =  Integer.max(max,rope[i] * (N - i));
        bw.write(max + "");
        bw.flush();
    }
}
