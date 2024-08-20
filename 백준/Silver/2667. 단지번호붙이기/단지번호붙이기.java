import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N, num;
        int[] count;
        int[][] arr;
        boolean run;
        String input;
        ArrayList<Integer> output;

        N = Integer.parseInt(br.readLine());
        arr = new int[N + 2][N + 2];
        num = 0;
        for(int i = 1; i <= N; i++) {
            input = br.readLine();
            for(int j = 1; j <= N; j++)
                if(input.charAt(j - 1) != '0')
                    arr[i][j] = ++num;
        }
        run = true;
        while(run) {
            run = false;
            for(int i = 1; i <= N; i++)
                for(int j = 1; j <= N; j++)
                    if(arr[i][j] != 0) {
                        if(arr[i - 1][j] != 0 && arr[i - 1][j] != arr[i][j]) {
                            arr[i][j] = Integer.min(arr[i][j], arr[i - 1][j]);
                            arr[i - 1][j] = arr[i][j];
                            run = true;
                        }
                        if(arr[i + 1][j] != 0 && arr[i + 1][j] != arr[i][j]) {
                            arr[i][j] = Integer.min(arr[i][j], arr[i + 1][j]);
                            arr[i + 1][j] = arr[i][j];
                            run = true;
                        }
                        if(arr[i][j - 1] != 0 && arr[i][j - 1] != arr[i][j]) {
                            arr[i][j] = Integer.min(arr[i][j], arr[i][j - 1]);
                            arr[i][j - 1] = arr[i][j];
                            run = true;
                        }
                        if(arr[i][j - 1] != 0 && arr[i][j - 1] != arr[i][j]) {
                            arr[i][j] = Integer.min(arr[i][j], arr[i][j - 1]);
                            arr[i][j - 1] = arr[i][j];
                            run = true;
                        }
                    }
        }
        count = new int[N * N];
        for(int i = 1; i <= N; i++)
            for(int j = 1; j <= N; j++)
                if(arr[i][j] != 0)
                    count[arr[i][j]]++;
        Arrays.sort(count);
        output = new ArrayList<>();
        for(int i = 0; i < N * N; i++)
            if(count[i] != 0)
                output.add(count[i]);
        bw.write(output.size() + "\n");
        for (int i : output)
            bw.write(i + "\n");
        bw.flush();
    }
}