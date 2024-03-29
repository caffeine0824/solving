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
		
		int N, result;
		String input;
		
		N = Integer.parseInt(br.readLine());
		input = br.readLine();
		result = 0;
		for(int i = 0; i < input.length(); i++) {
			result += (int)input.charAt(i) - 48;
		}
		bw.write(result + "");
		bw.flush();
	}	
}
