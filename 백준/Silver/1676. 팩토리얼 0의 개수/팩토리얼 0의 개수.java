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
		N = Integer.parseInt(br.readLine());
		result = 0;
		for(int i = 1; i <= (int)(Math.log(N) / Math.log(5)); i++)
			result += N / (int)Math.pow(5, i);
		bw.write(result + "");
		bw.flush();
	}	
}
