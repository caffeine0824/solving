import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int token, count;
        String str, korea;

        str = br.readLine();
        korea = "KOREA";
        token = 0;
        count = 0;
        for(int i = 0; i < str.length(); i++)
            if(str.charAt(i) == korea.charAt(token)) {
                count++;
                token++;
                if(token >= 5)
                    token = 0;
            }
        bw.write(count + "");
        bw.flush();
    }
}