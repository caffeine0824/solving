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

        int N;
        int[][] max, min;
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        max = new int[2][3];
        min = new int[2][3];
        for(int i = 0; i < 3; i++)
            max[0][i] = Integer.parseInt(st.nextToken());
        min[0] = max[0].clone();
        for(int i = 1; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 3; j++)
                max[1][j] = Integer.parseInt(st.nextToken());
            min[1] = max[1].clone();
            max[1][0] += Math.max(max[0][0], max[0][1]);
            max[1][1] += Math.max(Math.max(max[0][0], max[0][1]), max[0][2]);
            max[1][2] += Math.max(max[0][1], max[0][2]);
            max[0] = max[1].clone();
            min[1][0] += Math.min(min[0][0], min[0][1]);
            min[1][1] += Math.min(Math.min(min[0][0], min[0][1]), min[0][2]);
            min[1][2] += Math.min(min[0][1], min[0][2]);
            min[0] = min[1].clone();
        }
        Arrays.sort(max[0]);
        bw.write(max[0][2] + " ");
        Arrays.sort(min[0]);
        bw.write(min[0][0] + "");
        bw.flush();
    }
}