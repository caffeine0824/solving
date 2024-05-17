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

        int T, N, count, point;
        int[] arr;
        boolean[] check;
        StringTokenizer st;

        T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++) {
            N = Integer.parseInt(br.readLine());
            arr = new int[N + 1];
            st = new StringTokenizer(br.readLine());
            for(int j = 1; j <= N; j++)
                arr[j] = Integer.parseInt(st.nextToken());
            check = new boolean[N + 1];
            Arrays.fill(check, false);
            count = 0;
            for(int j = 1; j <= N; j++)
                if(!check[j]) {
                    count++;
                    check[j] = true;
                    point = arr[j];
                    while(point != j) {
                        check[point] = true;
                        point = arr[point];
                    }
                }
            bw.write(count + "\n");
        }
        bw.flush();
    }
}