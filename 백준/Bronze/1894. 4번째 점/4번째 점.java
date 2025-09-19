import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double x1, y1, x2, y2, x3, y3, midx, midy, x4, y4;
        double[] inputDouble;
        String input;
        StringTokenizer st;

        while((input = br.readLine()) != null) {
            st = new StringTokenizer(input);
            inputDouble = new double[8];
            for(int i = 0; i < 8; i++)
                inputDouble[i] = Double.parseDouble(st.nextToken());
            if((inputDouble[0] == inputDouble[4]) && (inputDouble[1] == inputDouble[5])) {
                x1 = inputDouble[0];
                y1 = inputDouble[1];
                x2 = inputDouble[2];
                y2 = inputDouble[3];
                x3 = inputDouble[6];
                y3 = inputDouble[7];
            }
            else if((inputDouble[0] == inputDouble[6]) && (inputDouble[1] == inputDouble[7])) {
                x1 = inputDouble[0];
                y1 = inputDouble[1];
                x2 = inputDouble[2];
                y2 = inputDouble[3];
                x3 = inputDouble[4];
                y3 = inputDouble[5];
            }
            else if((inputDouble[2] == inputDouble[4]) && (inputDouble[3] == inputDouble[5])) {
                x1 = inputDouble[2];
                y1 = inputDouble[3];
                x2 = inputDouble[0];
                y2 = inputDouble[1];
                x3 = inputDouble[6];
                y3 = inputDouble[7];
            }
            else {
                x1 = inputDouble[2];
                y1 = inputDouble[3];
                x2 = inputDouble[0];
                y2 = inputDouble[1];
                x3 = inputDouble[4];
                y3 = inputDouble[5];
            }
            midx = (x2 + x3) / 2;
            midy = (y2 + y3) / 2;
            x4 = (midx * 2) - x1;
            y4 = (midy * 2) - y1;
            System.out.printf("%.3f %.3f\n", x4, y4);
        }
        bw.flush();
    }
}
