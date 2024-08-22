import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n;
        double[] edge;
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        for(int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            edge = new double[3];
            for(int j = 0; j < 3; j++)
                edge[j] = Double.parseDouble(st.nextToken());
            Arrays.sort(edge);
            bw.write("Scenario #" + i + ":\n");
            if(edge[0] * edge[0] + edge[1] * edge[1] == edge[2] * edge[2])
                bw.write("yes\n\n");
            else
                bw.write("no\n\n");
        }
        bw.flush();
    }
}