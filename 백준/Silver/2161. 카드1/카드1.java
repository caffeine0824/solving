import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N;
        Queue<Integer> queue;

        N = Integer.parseInt(br.readLine());
        queue = new LinkedList<>();
        for(int i = 1; i <= N; i++)
            queue.add(i);
        while(!queue.isEmpty()) {
            bw.write(queue.remove() + " ");
            if(!queue.isEmpty())
                queue.add(queue.remove());
        }
        bw.flush();
    }
}