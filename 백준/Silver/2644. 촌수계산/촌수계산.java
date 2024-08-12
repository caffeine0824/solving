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

        int n, me, you, edge, x, y, count;
        int[] tree;
        boolean find;
        StringTokenizer st;
        Stack<Integer> stack;

        n = Integer.parseInt(br.readLine());
        tree = new int[n + 1];
        st = new StringTokenizer(br.readLine());
        me = Integer.parseInt(st.nextToken());
        you = Integer.parseInt(st.nextToken());
        edge = Integer.parseInt(br.readLine());
        for(int i = 0; i < edge; i++) {
            st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            tree[y] = x;
        }
        stack = new Stack<>();
        while(true) {
            stack.push(me);
            if(tree[me] == 0)
                break;
            else
                me = tree[me];
        }
        count = 0;
        find = false;
        while(true) {
            for(int i = 0; i < stack.size(); i++)
                if(stack.get(i) == you) {
                    find = true;
                    count += i;
                }
            if(tree[you] == 0 || find)
                break;
            else {
                you = tree[you];
                count++;
            }
        }
        if(!find)
            bw.write("-1");
        else
            bw.write(count + "");
        bw.flush();
    }
}
