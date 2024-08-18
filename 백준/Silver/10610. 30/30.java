import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int sum;
        Integer[] arr;
        String input;

        input = br.readLine();
        arr = new Integer[input.length()];
        sum = 0;
        for(int i = 0; i < input.length(); i++) {
            arr[i] = input.charAt(i) - 48;
            sum += arr[i];
        }
        if(sum % 3 != 0)
            bw.write("-1");
        else {
            Arrays.sort(arr, Collections.reverseOrder());
            if(arr[input.length() - 1] != 0)
                bw.write("-1");
            else
                for(int i = 0; i < input.length(); i++)
                    bw.write(arr[i] + "");
        }
        bw.flush();
    }
}