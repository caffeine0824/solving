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
        int[] dwarf;
        ArrayList<Integer> seven;

        dwarf = new int[9];
        seven = new ArrayList<>();
        for(int i = 0; i < 9; i++) 
            dwarf[i] = Integer.parseInt(br.readLine());
        for(int i = 0; i < 9; i++)
            for(int j = 0; j < 9; j++)
                if(i != j) {
                    sum = 0;
                    seven.clear();
                    for(int k = 0; k < 9; k++)
                        if(k != i && k != j) {
                            sum += dwarf[k];
                            seven.add(dwarf[k]);
                        }
                    if(sum == 100) {
                        Collections.sort(seven);
                        i = 10;
                        for(int k = 0; k < 7; k++)
                            bw.write(seven.get(k) + "\n");
                    }
                }
        bw.flush();
    }
}