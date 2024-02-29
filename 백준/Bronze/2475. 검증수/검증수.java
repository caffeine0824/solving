import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {

	private static int calculate(int input[]) {
		int output = 0;
		
		for(int i = 0; i < 5; i++) {
			output += input[i] * input[i];
		}
		output %= 10;
		return output;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] number = new int[5];
		StringTokenizer input = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < 5; i++)
			number[i] = Integer.parseInt(input.nextToken());
		
		bw.write(calculate(number) + "");
		bw.flush();
	}		
}
