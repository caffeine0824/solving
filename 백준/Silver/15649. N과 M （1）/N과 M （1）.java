import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
    public static int N, M;
    public static int[] arr;
    public static boolean[] check;
    public static void func(int input, int level) {
        arr[level] = input;
        check[input] = true;
        if(level == M - 1) {
            for(int i = 0; i < M; i++)
                System.out.print(arr[i] + " ");
            System.out.print("\n");
        }
        else
            for(int i = 1; i <= N; i++)
                if(!check[i])
                    func(i, level + 1);
        check[input] = false;
    }
    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[M];
        check = new boolean[N + 1];
        Arrays.fill(check, false);
        for(int i = 1; i <= N; i++)
            func(i, 0);
        bw.flush();
    }
}