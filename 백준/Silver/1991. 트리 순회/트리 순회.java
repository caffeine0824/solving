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

        int N, point, root;
        int[] front, middle, back;
        int[][] tree;
        boolean[] frontCheck, middleCheck, backCheck;
        StringTokenizer st;
        Stack<Integer> stack;

        N = Integer.parseInt(br.readLine());
        tree = new int[N][2];
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            root = st.nextToken().charAt(0) - 65;
            tree[root][0] = st.nextToken().charAt(0) - 65;
            if(tree[root][0] < 0)
                tree[root][0] = -1;
            tree[root][1] = st.nextToken().charAt(0) - 65;
            if(tree[root][1] < 0)
                tree[root][1] = -1;
        }
        front = new int[N];
        frontCheck = new boolean[N];
        Arrays.fill(frontCheck, true);
        point = 0;
        stack = new Stack<>();
        for(int i = 0; i < N; i++) {
            while(!frontCheck[point]) {
                if(tree[point][0] != -1 && frontCheck[tree[point][0]]) {
                    stack.push(point);
                    point = tree[point][0];
                }
                else if(tree[point][1] != -1 && frontCheck[tree[point][1]]) {
                    stack.push(point);
                    point = tree[point][1];
                }
                else
                    point = stack.pop();
            }
            front[i] = point;
            frontCheck[point] = false;
        }
        middle = new int[N];
        middleCheck = new boolean[N];
        Arrays.fill(middleCheck, true);
        point = 0;
        stack = new Stack<>();
        for(int i = 0; i < N; i++) {
            while(true) {
                if(tree[point][0] != -1 && middleCheck[tree[point][0]]) {
                    stack.push(point);
                    point = tree[point][0];
                }
                else if(middleCheck[point])
                    break;
                else if(tree[point][1] != -1 && middleCheck[tree[point][1]]) {
                    stack.push(point);
                    point = tree[point][1];
                }
                else
                    point = stack.pop();
            }
            middle[i] = point;
            middleCheck[point] = false;
        }
        back = new int[N];
        backCheck = new boolean[N];
        Arrays.fill(backCheck, true);
        point = 0;
        stack = new Stack<>();
        for(int i = 0; i < N; i++) {
            while(true) {
                if(tree[point][0] != -1 && backCheck[tree[point][0]]) {
                    stack.push(point);
                    point = tree[point][0];
                }
                else if(tree[point][1] != -1 && backCheck[tree[point][1]]) {
                    stack.push(point);
                    point = tree[point][1];
                }
                else if(backCheck[point])
                    break;
                else
                    point = stack.pop();
            }
            back[i] = point;
            backCheck[point] = false;
        }
        for(int i = 0; i < N; i++)
            bw.write((char)(front[i] + 65));
        bw.write("\n");
        for(int i = 0; i < N; i++)
            bw.write((char)(middle[i] + 65));
        bw.write("\n");
        for(int i = 0; i < N; i++)
            bw.write((char)(back[i] + 65));
        bw.flush();
    }
}