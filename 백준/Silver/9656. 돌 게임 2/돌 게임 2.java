import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N;

        N = Integer.parseInt(br.readLine());
        if(N % 2 == 1)
            bw.write("CY");
        else
            bw.write("SK");
        bw.flush();
    }
}