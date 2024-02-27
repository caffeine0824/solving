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
		
		String input = br.readLine();
		byte[] str = input.getBytes();
		for(int i = 0; i < input.length(); i++) {
			if((str[i] > 64) && (str[i] < 91)) {
				str[i] += 32;
			}
			else if((str[i] > 96) && (str[i] < 123)) {
				str[i] -= 32;
			}
		}
		String output = new String(str);
		bw.write(output);
		bw.flush();
	}		
}
