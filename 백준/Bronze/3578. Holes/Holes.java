import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int h;
        
        h = Integer.parseInt(br.readLine());
        if(h == 0)
            bw.write("1");
        else if(h == 1)
            bw.write("0");
        else if((h % 2) == 0)
            for(int i = 0; i < h / 2; i++)
                bw.write("8");
        else {
            bw.write("4");
            for(int i = 0; i < h / 2; i++)
                bw.write("8");
        }
        bw.flush();
    }
}