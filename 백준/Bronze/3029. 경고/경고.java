import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int now, bomb, stay;
        int[] result;
        String input;
        String[] inputSplit;

        input = br.readLine();
        inputSplit = input.split(":");
        now = Integer.parseInt(inputSplit[0]) * 3600 + Integer.parseInt(inputSplit[1]) * 60 + Integer.parseInt(inputSplit[2]);
        input = br.readLine();
        inputSplit = input.split(":");
        bomb = Integer.parseInt(inputSplit[0]) * 3600 + Integer.parseInt(inputSplit[1]) * 60 + Integer.parseInt(inputSplit[2]);
        if(now >= bomb)
            bomb += 86400;
        stay = bomb - now;
        result = new int[3];
        result[0] = stay / 3600;
        stay %= 3600;
        result[1] = stay / 60;
        stay %= 60;
        result[2] = stay;
        bw.write(String.format("%02d:%02d:%02d", result[0], result[1], result[2]));
        bw.flush();
    }
}