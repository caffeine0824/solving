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

        int x, y, totalDay;
        int[] monthDay = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        x = Integer.parseInt(st.nextToken());
        y = Integer.parseInt(st.nextToken());
        totalDay = y;
        for(int i = 0; i < x; i++)
            totalDay += monthDay[i];
        switch(totalDay % 7) {
            case 1:
                bw.write("MON");
                break;
            case 2:
                bw.write("TUE");
                break;
            case 3:
                bw.write("WED");
                break;
            case 4:
                bw.write("THU");
                break;
            case 5:
                bw.write("FRI");
                break;
            case 6:
                bw.write("SAT");
                break;
            case 0:
                bw.write("SUN");
                break;
        }
        bw.flush();
    }
}