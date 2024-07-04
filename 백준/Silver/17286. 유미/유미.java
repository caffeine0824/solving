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

        double min, sum;
        double[][] loc, dist;
        StringTokenizer st;

        loc = new double[4][2];
        for(int i = 0; i < 4; i++) {
            st = new StringTokenizer(br.readLine());
            loc[i][0] = Double.parseDouble(st.nextToken());
            loc[i][1] = Double.parseDouble(st.nextToken());
        }
        dist = new double[4][4];
        for(int i = 0; i < 4; i++)
            for(int j = 0; j < 4; j++)
                dist[i][j] = Math.sqrt(Math.pow(loc[i][0] - loc[j][0], 2) + Math.pow(loc[i][1] - loc[j][1], 2));
        min = Double.MAX_VALUE;
        for(int i = 0; i < 3; i++) {
            sum = dist[0][i + 1] + dist[i + 1][(i + 1) % 3 + 1] + dist[(i + 1) % 3 + 1][(i + 2) % 3 + 1];
            if(sum < min)
                min = sum;
            sum = dist[0][i + 1] + dist[i + 1][(i + 2) % 3 + 1] + dist[(i + 2) % 3 + 1][(i + 1) % 3 + 1];
            if(sum < min)
                min = sum;
        }
        bw.write((int)min + "");
        bw.flush();
    }
}