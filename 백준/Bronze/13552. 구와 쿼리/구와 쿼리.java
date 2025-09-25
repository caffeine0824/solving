import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N, M, count;
        long distance;
        int[][] point, query;
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        point = new int[N][3];
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 3; j++)
                point[i][j] = Integer.parseInt(st.nextToken());
        }

        M = Integer.parseInt(br.readLine());
        query = new int[M][4];
        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 4; j++)
                query[i][j] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < M; i++) {
            count = 0;
            for(int j = 0; j < N; j++) {
                distance = (((long) (query[i][0] - point[j][0]) * (query[i][0] - point[j][0]))
                        + ((long) (query[i][1] - point[j][1]) * (query[i][1] - point[j][1]))
                        + ((long) (query[i][2] - point[j][2]) * (query[i][2] - point[j][2])));
                if(distance <= (long) query[i][3] * query[i][3])
                    count++;
            }
            bw.write(count + "\n");
        }
        bw.flush();
    }
}