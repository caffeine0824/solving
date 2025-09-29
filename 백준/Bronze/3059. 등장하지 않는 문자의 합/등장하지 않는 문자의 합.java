import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T, result;
        boolean[] exist;
        String S;

        T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++) {
            exist = new boolean[26];
            S = br.readLine();
            for(int j = 0; j < S.length(); j++)
                exist[S.charAt(j) - 65] = true;
            result = 0;
            for(int j = 0; j < exist.length; j++)
                if(!exist[j])
                    result += j + 65;
            bw.write(result + "\n");
        }
        bw.flush();
    }
}