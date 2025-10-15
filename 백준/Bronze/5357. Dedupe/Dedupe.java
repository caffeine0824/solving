import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N;
        String input;

        N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++) {
            input = br.readLine();
            bw.write(input.charAt(0) + "");
            for(int j = 1; j < input.length(); j++) {
                if(input.charAt(j) != input.charAt(j - 1))
                    bw.write(input.charAt(j) + "");
            }
            bw.write("\n");
        }
        bw.flush();
    }
}