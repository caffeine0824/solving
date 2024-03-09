import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T, input, zeroCall, oneCall, temp;
		
		T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			input = Integer.parseInt(br.readLine());
			if(input == 0)
				bw.write("1 0\n");
			else {
				zeroCall = 0;
				oneCall = 1;
				for(int j = 0; j < input - 1; j++) {
					temp = oneCall;
					oneCall += zeroCall;
					zeroCall = temp;
				}
				bw.write(zeroCall + " " + oneCall + "\n");
			}
		}
		
		bw.flush();
	}		
}
