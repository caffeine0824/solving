import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int result;
        String map;

        br.readLine();
        map = br.readLine();
        result = 0;
        for(int i = 1; i < map.length(); i++)
            if(map.charAt(i) == 'W' && map.charAt(i - 1) == 'E')
                result++;
        bw.write(result + "");
        bw.flush();
    }
}