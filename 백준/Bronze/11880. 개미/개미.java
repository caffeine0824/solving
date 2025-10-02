import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T; 
        long result;
        int[] length;
        StringTokenizer st;

        T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++) {
            length = new int[3];
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 3; j++)
                length[j] = Integer.parseInt(st.nextToken());
            if(length[0] >= length[1] && length[0] >= length[2])
                result = (((long)length[0] * length[0]) + (long)(length[1] + length[2]) * (length[1] + length[2]));
            else if(length[1] >= length[2])
                result = (((long) length[1] * length[1])) + (long)(length[0] + length[2]) * (length[0] + length[2]);
            else
                result = ((long)length[2] * length[2]) + (long)(length[0] + length[1]) * (length[0] + length[1]);
            bw.write(result + "\n");
        }
        bw.flush();
    }
}