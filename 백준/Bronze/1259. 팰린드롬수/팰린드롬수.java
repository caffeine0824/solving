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
		
		boolean check;
		String input;
		
		while(!(input = br.readLine()).equals("0")) {
			check = true;
			for(int i = 0; i < (input.length() / 2); i++) {
				if(input.charAt(i) != input.charAt((input.length() - 1) - i)) {
					check = false;
				}
			}
			if(check)
				bw.write("yes\n");
			else
				bw.write("no\n");
		}
		bw.flush();
		
			
	}		
}