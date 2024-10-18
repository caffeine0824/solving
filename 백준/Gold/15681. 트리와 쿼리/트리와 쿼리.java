import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.*;

public class Main {
    static int[] size;
    static Node[] tree;
    static class Node {
        int name;
        int parent = 0;
        ArrayList<Integer> child;
        Node(int name) {
            this.name = name;
            child = new ArrayList<>();
        }
    }
    static int sizeCheck(int nowNode) {
        if(size[nowNode] == 0) {
            size[nowNode] = 1;
            for(int i = 0; i < tree[nowNode].child.size(); i++)
                size[nowNode] += sizeCheck(tree[nowNode].child.get(i));
        }
        return size[nowNode];
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N, R, Q, U, V, nowNode, parentIndex;
        StringTokenizer st;
        Queue<Integer> queue;

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());
        Q = Integer.parseInt(st.nextToken());
        tree = new Node[N + 1];
        for(int i = 1; i <= N; i++)
            tree[i] = new Node(i);
        for(int i = 0; i < N - 1; i++) {
            st = new StringTokenizer(br.readLine());
            U = Integer.parseInt(st.nextToken());
            V = Integer.parseInt(st.nextToken());
            tree[U].child.add(V);
            tree[V].child.add(U);
        }
        size = new int[N + 1];
        Arrays.fill(size, 0);
        tree[R].parent = -1;
        queue = new LinkedList<>();
        queue.add(R);
        while(!queue.isEmpty()) {
            nowNode = queue.poll();
            parentIndex = -1;
            for(int i = 0; i < tree[nowNode].child.size(); i++) {
                if(tree[nowNode].child.get(i) != tree[nowNode].parent) {
                    tree[tree[nowNode].child.get(i)].parent = nowNode;
                    queue.add(tree[nowNode].child.get(i));
                }
                else
                    parentIndex = i;
            }
            if(parentIndex != -1)
                tree[nowNode].child.remove(parentIndex);
        }
        sizeCheck(R);
        for(int i = 0; i < Q; i++)
            bw.write(size[Integer.parseInt(br.readLine())] + "\n");
        bw.flush();
    }
}
