import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int M, N, min, sum;
        boolean prime, find;
        Stack<Integer> stack;

        M = Integer.parseInt(br.readLine());
        N = Integer.parseInt(br.readLine());
        stack = new Stack<>();
        find = false;
        for(int i = M; i <= N; i++) {
            prime = true;
            if(i == 1)
                prime = false;
            else
                for (int j = 2; j < i; j++)
                    if (i % j == 0) {
                        prime = false;
                        break;
                    }
            if(prime) {
                stack.push(i);
                find = true;
            }
        }
        if(find) {
            min = stack.get(0);
            sum = 0;
            while (!stack.empty())
                sum += stack.pop();
            bw.write(sum + "\n" + min);
        }
        else
            bw.write("-1");
        bw.flush();
    }
}