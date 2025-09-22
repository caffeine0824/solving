import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N;
        StringTokenizer st;
        Stack<String> stack;

        N = Integer.parseInt(br.readLine());
        stack = new Stack<>();
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            while(st.hasMoreTokens())
                stack.push(st.nextToken());
            bw.write("Case #" + (i + 1) + ": ");
            while(!stack.empty())
                bw.write(stack.pop() + " ");
            bw.write("\n");
        }
        bw.flush();
    }
}