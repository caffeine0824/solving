import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N, length;
        String input;

        N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++) {
            input = br.readLine();
            length = input.length();
            if(input.charAt(length / 2) == input.charAt((length / 2) - 1))
                bw.write("Do-it\n");
            else
                bw.write("Do-it-Not\n");
        }
        bw.flush();
    }
}