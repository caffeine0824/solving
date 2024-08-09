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

        int[] side;
        StringTokenizer st;

        side = new int[3];
        while(true) {
            st = new StringTokenizer(br.readLine());
            for(int i = 0; i < 3; i++)
                side[i] = Integer.parseInt(st.nextToken());
            if(side[0] == 0)
                break;
            Arrays.sort(side);
            if(side[0] == side[1] && side[1] == side[2])
                bw.write("Equilateral\n");
            else if(side[2] >= side[0] + side[1])
                bw.write("Invalid\n");
            else if(side[0] == side[1] || side[1] == side[2])
                bw.write("Isosceles\n");
            else
                bw.write("Scalene\n");
        }
        bw.flush();
    }
}