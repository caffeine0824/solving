import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N, result, p1, p2;
        int[][] point;
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        point = new int[N][6];
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 6; j++)
                point[i][j] = Integer.parseInt(st.nextToken());
        }
        result = 1;
        for(int i = 0; i < 3; i++) {
            p1 = Integer.MIN_VALUE;
            p2 = Integer.MAX_VALUE;
            for(int j = 0; j < N; j++) {
                p1 = Math.max(p1, point[j][i]);
                p2 = Math.min(p2, point[j][i + 3]);
            }
            if(p1 < p2)
                result *= p2 - p1;
            else {
                result = 0;
                break;
            }
        }
        bw.write(result + "");
        bw.flush();
    }
}