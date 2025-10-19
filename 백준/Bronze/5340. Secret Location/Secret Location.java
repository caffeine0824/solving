import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] x;
        String input;
        x = new int[6];
        for(int i = 0; i < 6; i++) {
            x[i] = (input = br.readLine()).length();
            for(int j = 0; j < input.length(); j++) {
                if(input.charAt((input.length() - j) - 1) == ' ')
                    x[i]--;
                else
                    break;
            }
        }
        bw.write("Latitude " + x[0] + ":" + x[1] + ":" + x[2] + "\n" +
                "Longitude " + x[3] + ":" + x[4] + ":" + x[5]);
        bw.flush();
    }
}