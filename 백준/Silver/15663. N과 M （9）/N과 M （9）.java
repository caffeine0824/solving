import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
    static int N, M, temp, tempLv;
    static int[] arr;
    static boolean[] check;
    static Stack<Integer> stack;

    public static void func(int index, int level) {
        check[index] = true;
        stack.push(arr[index]);
        if(level == M - 1) {
            for (int i = 0; i < M; i++)
                System.out.print(stack.get(i) + " ");
            System.out.print("\n");
        }
        else
            for(int i = 0; i < N; i++)
                if(!check[i] && !(arr[i] == temp && tempLv == level + 1))
                    func(i, level + 1);
        temp = stack.pop();
        tempLv = level;
        check[index] = false;
    }
    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++)
            arr[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(arr);
        check = new boolean[N];
        Arrays.fill(check, false);
        stack = new Stack<>();
        temp = -1;
        tempLv = -1;
        for(int i = 0; i < N; i++)
            if(!(arr[i] == temp && tempLv == 0))
                func(i, 0);
        bw.flush();
    }
}