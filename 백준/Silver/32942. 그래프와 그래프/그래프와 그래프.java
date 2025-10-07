import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double A, B, C;
        boolean exist;
        boolean[][] graph;
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        graph = new boolean[11][11];
        for(int i = 1; i <= 10; i++)
            for(int j = 1; j <= 10; j++)
                if(i * A + j * B == C)
                    graph[i][j] = true;
        for(int i = 1; i <= 10; i++) {
            exist = false;
            for(int j = 1; j <= 10; j++) {
                if(graph[i][j]) {
                    bw.write(j + " ");
                    exist = true;
                }
            }
            if(!exist)
                bw.write("0");
            bw.write("\n");
        }
        bw.flush();
    }
}