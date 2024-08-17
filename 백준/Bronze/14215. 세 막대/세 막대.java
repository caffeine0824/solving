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

        int output;
        int[] edge;
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        edge = new int[3];
        for(int i = 0; i < 3; i++)
            edge[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(edge);
        if(edge[2] >= edge[0] + edge[1])
            output = (edge[0] + edge[1]) * 2 - 1;
        else
            output = edge[0] + edge[1] + edge[2];
        bw.write(output + "");
        bw.flush();
    }
}