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
		
		int T, stack;
		String input;
		
		T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			input = br.readLine();
			stack = 0;
			for(int j = 0; j < input.length(); j++) {
				if(input.charAt(j) == '(')
					stack++;
				else if(input.charAt(j) == ')') {
					stack--;
					if(stack < 0) {
						stack = -1;
						break;
					}
				}
			}
			if(stack == 0)
				bw.write("YES\n");
			else
				bw.write("NO\n");
		}
		
		bw.flush();
	}		
}
