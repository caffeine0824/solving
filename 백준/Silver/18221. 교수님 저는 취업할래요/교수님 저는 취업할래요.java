import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;
import java.io.IOException;

public class Main {
    public static class Person {
        int x;
        int y;
    }
    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N, x1, y1, x2, y2, count;
        int[][] room;
        double dist;
        StringTokenizer st;
        Person professor, me;

        N = Integer.parseInt(br.readLine());
        room = new int[N][N];
        professor = new Person();
        me = new Person();
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++) {
                room[i][j] = Integer.parseInt(st.nextToken());
                if(room[i][j] == 5) {
                    professor.x = j;
                    professor.y = i;
                }
                if(room[i][j] == 2) {
                    me.x = j;
                    me.y = i;
                }
            }
        }
        dist = Math.sqrt(Math.pow(me.x - professor.x, 2) + Math.pow(me.y - professor.y, 2));
        if(dist < 5)
            bw.write("0");
        else {
            count = 0;
            if(professor.x < me.x) {
                x1 = professor.x;
                x2 = me.x;
            }
            else {
                x1 = me.x;
                x2 = professor.x;
            }
            if(professor.y < me.y) {
                y1 = professor.y;
                y2 = me.y;
            }
            else {
                y1 = me.y;
                y2 = professor.y;
            }
            for(int i = y1; i <= y2; i++)
                for(int j = x1; j <= x2; j++)
                    if(room[i][j] == 1)
                        count++;
            if(count < 3)
                bw.write("0");
            else
                bw.write("1");
        }
        bw.flush();
    }
}