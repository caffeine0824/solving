import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T;
        int[] edge;
        StringTokenizer st;

        T = Integer.parseInt(br.readLine());
        edge = new int[3];
        for(int i = 1; i <= T; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 3; j++)
                edge[j] = Integer.parseInt(st.nextToken());
            Arrays.sort(edge);
            bw.write("Case #" + i + ": ");
            if(edge[2] >= edge[0] + edge[1])
                bw.write("invalid!");
            else if(edge[0] == edge[2])
                bw.write("equilateral");
            else if(edge[1] == edge[2] || edge[0] == edge[1])
                bw.write("isosceles");
            else
                bw.write("scalene");
            bw.write("\n");
        }
        bw.flush();
    }
}
