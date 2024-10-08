import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N, level, printCount;
        boolean[][] map;

        N = Integer.parseInt(br.readLine());
        map = new boolean[N / 3 + 1][N / 3 + 1];
        for(boolean[] i : map)
            Arrays.fill(i, false);
        map[1][1] = true;
        level = 1;
        while(level <= (N / 3) / 2) {
            for(int i = 1; i <= level; i++)
                for(int j = 1; j <= i; j++)
                    if(map[i][j]) {
                        map[i + level][j] = true;
                        map[i + level][j + level] = true;
                    }
            level *= 2;
        }
        for(int i = N - 1; i >= 0; i--) {
            printCount = 0;
            for(int j = 0; j < i / 3; j++) {
                bw.write("   ");
                printCount++;
            }
            for(int j = 1; j <= N / 3; j++) {
                if(map[(N / 3) - (i / 3)][j]) {
                    if(i % 3 == 2)
                        bw.write("  *   ");
                    else if(i % 3 == 1)
                        bw.write(" * *  ");
                    else
                        bw.write("***** ");
                    printCount += 2;
                }
                else if(printCount + 2 <= (N / 3) * 2) {
                    bw.write("      ");
                    printCount += 2;
                }
                else if(printCount + 1 == (N / 3) * 2) {
                    bw.write("   ");
                    printCount++;
                }
            }
            bw.write("\n");
        }
        bw.flush();
    }
}
