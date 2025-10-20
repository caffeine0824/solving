import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N, nowX, nowY, distance, timeoverCounter;
        int[][] map;
        int[][][] parent;
        boolean[][] check;
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++)
                map[i][j] = Integer.parseInt(st.nextToken());
        }

        nowX = 0;
        nowY = 0;
        parent = new int[N][N][2];
        check = new boolean[N][N];
        timeoverCounter = 0;
        while(true) {
            distance = map[nowY][nowX];
            if(distance == -1) {
                bw.write("HaruHaru");
                break;
            }
            if(nowX + distance < N && !check[nowY][nowX + distance]) {
                parent[nowY][nowX + distance][0] = nowX;
                parent[nowY][nowX + distance][1] = nowY;
                nowX += distance;
            }
            else if(nowY + distance < N && !check[nowY + distance][nowX]) {
                parent[nowY + distance][nowX][0] = nowX;
                parent[nowY + distance][nowX][1] = nowY;
                nowY += distance;
            }
            else {
                check[nowY][nowX] = true;
                if(nowX == 0 && nowY == 0) {
                    bw.write("Hing");
                    break;
                }
                nowX = parent[nowY][nowX][0];
                nowY = parent[nowY][nowX][1];
            }
            timeoverCounter++;
            if(timeoverCounter > 400000) {
                bw.write("Hing");
                break;
            }
        }
        bw.flush();
    }
}