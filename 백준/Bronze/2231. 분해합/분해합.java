import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int input, digitNumberSum, result;
		String digitNumberStr;
		
		input = Integer.parseInt(br.readLine());
		result = 0;
		for(int i = 1; i <= input; i++) {
			digitNumberStr = Integer.toString(i);
			digitNumberSum = 0;
			for(int j = 0; j < digitNumberStr.length(); j++) {
				digitNumberSum += Character.getNumericValue(digitNumberStr.charAt(j)); 
			}
			if((digitNumberSum + i) == input) {
				result = i;
				break;
			}
		}
		bw.write(result + "");
		bw.flush();
	}		
}