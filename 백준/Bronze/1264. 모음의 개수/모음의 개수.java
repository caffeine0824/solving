import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException, InterruptedException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int count;
		char c;
		String input;
		
		while(true) {
			input = br.readLine();
			if(input.equals("#"))
				break;
			count = 0;
			for(int i = 0; i < input.length(); i++) {
				c = input.charAt(i);
				if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' 
						|| c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
					count++;
			}
			bw.write(count + "\n");
		}
		bw.flush();
	}	
}