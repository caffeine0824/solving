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

        int N, K;
        ArrayList<Integer> output;
        Queue<Integer> round;
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        round = new LinkedList<>();
        for(int i = 0; i < N; i++)
            round.add(i + 1);
        output = new ArrayList<Integer>();
        while(!round.isEmpty()) {
            for(int i = 1; i < K; i++)
                round.add(round.remove());
            output.add(round.remove());
        }
        bw.write("<");
        for(int i = 0; i < N; i++) {
            if(i == N - 1)
                bw.write(output.get(i) + ">");
            else
                bw.write(output.get(i) + ", ");
        }
        bw.flush();
    }
}