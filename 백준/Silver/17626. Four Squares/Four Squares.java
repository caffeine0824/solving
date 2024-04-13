import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
	public static int find(int n, int term) {
		int sqrt, minTerm;
		sqrt = (int)Math.sqrt(n); 
		if((sqrt * sqrt == n) || (term == 4))
			return term;
		else {
			minTerm = 4;
			for(int i = sqrt; i > 0; i--)
				if(find(n - i * i, term + 1) < minTerm)
					minTerm = find(n - i * i, term + 1);
			return minTerm;
		}
	}
	public static void main(String[] args) throws IOException, InterruptedException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n, result;
		
		n = Integer.parseInt(br.readLine());
		result = find(n, 1);
		bw.write(result + "");
		bw.flush();
	}	
}