import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N;
        String str;

        N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++) {
            str = br.readLine();
            if(str.charAt(0) > 96 && str.charAt(0) < 123)
                bw.write(str.charAt(0) - 32);
            else
                bw.write(str.charAt(0));
            for(int j = 1; j < str.length(); j++)
                bw.write(str.charAt(j) + "");
            bw.write("\n");
        }
        bw.flush();
    }
}
