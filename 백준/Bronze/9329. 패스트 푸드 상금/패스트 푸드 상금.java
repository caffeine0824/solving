import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T, n, m, k, input, result, least;
        int[] prize, stickerMax;
        boolean[][] stickerCheck;
        StringTokenizer st;

        T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());
            stickerCheck = new boolean[n][m + 1];
            prize = new int[n];
            for(int j = 0; j < n; j++) {
                st = new StringTokenizer(br.readLine());
                k = Integer.parseInt(st.nextToken());
                for(int l = 0; l < k; l++) {
                    input = Integer.parseInt(st.nextToken());
                    stickerCheck[j][input] = true;
                }
                prize[j] = Integer.parseInt(st.nextToken());
            }
            stickerMax = new int[m + 1];
            st = new StringTokenizer(br.readLine());
            for(int j = 1; j <= m; j++)
                stickerMax[j] = Integer.parseInt(st.nextToken());
            result = 0;
            for(int j = 0; j < n; j++) {
                least = Integer.MAX_VALUE;
                for(int l = 1; l <= m; l++)
                    if(stickerCheck[j][l] && (stickerMax[l] < least))
                        least = stickerMax[l];
                result += least * prize[j];
            }
            bw.write(result + "\n");
        }
        bw.flush();
    }
}