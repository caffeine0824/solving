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
		
		int count, stringSize;
		String input;
		
		count = Integer.parseInt(br.readLine());
		for(int i = 0; i < count; i++) {
			input = br.readLine();
			stringSize = input.length();
			bw.write(Character.toString(input.charAt(0)) + Character.toString(input.charAt(stringSize - 1)) + "\n");
		}
		bw.flush();
	}		
}