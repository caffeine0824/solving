import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T;
        int[] score;
        double distance;
        double[][][] loc;
        StringTokenizer st;

        T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            loc = new double[2][3][2];
            for(int j = 0; j < 2; j++)
                for(int k = 0; k < 3; k++)
                    for(int l = 0; l < 2; l++)
                        loc[j][k][l] = Double.parseDouble(st.nextToken());
            score = new int[2];
            for(int j = 0; j < 2; j++)
                for(int k = 0; k < 3; k++) {
                    distance = Math.sqrt(Math.pow(loc[j][k][0], 2) + Math.pow(loc[j][k][1], 2));
                    if(distance <= 3)
                        score[j] += 100;
                    else if(distance <= 6)
                        score[j] += 80;
                    else if(distance <= 9)
                        score[j] += 60;
                    else if(distance <= 12)
                        score[j] += 40;
                    else if(distance <= 15)
                        score[j] += 20;
                }
            if(score[0] == score[1])
                bw.write("SCORE: " + score[0] + " to " + score[1] + ", TIE.\n");
            else if(score[0] > score[1])
                bw.write("SCORE: " + score[0] + " to " + score[1] + ", PLAYER 1 WINS.\n");
            else
                bw.write("SCORE: " + score[0] + " to " + score[1] + ", PLAYER 2 WINS.\n");
        }
        bw.flush();
    }
}