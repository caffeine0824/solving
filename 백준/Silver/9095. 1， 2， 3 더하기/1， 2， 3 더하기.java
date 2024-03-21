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
		
		int T, N;
		int[] memo;
		
		T = Integer.parseInt(br.readLine());
		memo = new int[11];
		memo[1] = 1;
		memo[2] = 2;
		memo[3] = 4;
		for(int i = 4; i < 11; i++)
			memo[i] = memo[i - 3] + memo[i - 2] + memo[i - 1];
		for(int i = 0; i < T; i++) {
			N = Integer.parseInt(br.readLine());
			bw.write(memo[N] + "\n");
		}
		bw.flush();
	}	
}
