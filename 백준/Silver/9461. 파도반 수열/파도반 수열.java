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
		
		int T, N, memoStack;
		long[] memo;
		
		T = Integer.parseInt(br.readLine());
		memo = new long[101];
		memo[1] = 1;
		memo[2] = 1;
		memo[3] = 1;
		memo[4] = 2;
		memoStack = 4;
		for(int i = 0; i < T; i++) {
			N = Integer.parseInt(br.readLine());
			while(N > memoStack) {
				memoStack++;
				memo[memoStack] = memo[memoStack - 1] + memo[memoStack - 5];
			}
			bw.write(memo[N] + "\n");
		}
		bw.flush();
	}	
}
