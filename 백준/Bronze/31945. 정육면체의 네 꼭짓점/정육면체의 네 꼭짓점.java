import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T;
        int[] input;
        int[][] point = {{0, 0, 0}, {0, 0, 1}, {0, 1, 0}, {0, 1, 1}, {1, 0, 0}, {1, 0, 1}, {1, 1, 0}, {1, 1, 1}};
        boolean result;
        StringTokenizer st;

        T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            input = new int[4];
            for(int j = 0; j < 4; j++)
                input[j] = Integer.parseInt(st.nextToken());
            result = false;
            for(int j = 0; j < 3; j++)
                if(point[input[0]][j] == point[input[1]][j]
                        && point[input[1]][j] == point[input[2]][j]
                        && point[input[2]][j] == point[input[3]][j]) {
                    result = true;
                    break;
                }
            if(result)
                bw.write("YES\n");
            else
                bw.write("NO\n");
        }
        bw.flush();
    }
}