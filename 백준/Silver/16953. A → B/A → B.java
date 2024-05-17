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

        int level, result;
        long A, B, loc;
        StringTokenizer st;
        Queue<Integer>levelQueue;
        Queue<Long> queue;

        st = new StringTokenizer(br.readLine());
        A = Long.parseLong(st.nextToken());
        B = Long.parseLong(st.nextToken());
        queue = new LinkedList<>();
        levelQueue = new LinkedList<>();
        queue.add(A);
        level = 1;
        levelQueue.add(level);
        result = -1;
        while(!queue.isEmpty()) {
            loc = queue.poll();
            level = levelQueue.poll();
            if(loc * 2 <= B) {
                queue.add(loc * 2);
                levelQueue.add(level + 1);
            }
            if(loc * 10 + 1 <= B) {
                queue.add(loc * 10 + 1);
                levelQueue.add(level + 1);
            }
            if(loc == B) {
                result = level;
                break;
            }
        }
        bw.write(result + "");
        bw.flush();
    }
}