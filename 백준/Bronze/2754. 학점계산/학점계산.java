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
		double result = 0;
		
		if(input.contentEquals("A+"))
			result = 4.3;
		if(input.contentEquals("A0"))
			result = 4.0;
		if(input.contentEquals("A-"))
			result = 3.7;
		if(input.contentEquals("B+"))
			result = 3.3;
		if(input.contentEquals("B0"))
			result = 3.0;
		if(input.contentEquals("B-"))
			result = 2.7;
		if(input.contentEquals("C+"))
			result = 2.3;
		if(input.contentEquals("C0"))
			result = 2.0;
		if(input.contentEquals("C-"))
			result = 1.7;
		if(input.contentEquals("D+"))
			result = 1.3;
		if(input.contentEquals("D0"))
			result = 1.0;
		if(input.contentEquals("D-"))
			result = 0.7;
		if(input.contentEquals("F"))
			result = 0.0;
		bw.write(result + "");
		bw.flush();
	}		
}
