import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[][] sheet =
                {{"NLCS", "BHA", "KIS", "SJA"},
                        {"North London Collegiate School",
                                "Branksome Hall Asia", "Korea International School", "St. Johnsbury Academy"}};
        String str = br.readLine();
        for(int i = 0; i < 4; i++) {
            if(str.equals(sheet[0][i])) {
                bw.write(sheet[1][i] + "");
            }
        }
        bw.flush();
    }
}
