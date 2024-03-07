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
		
		int M, N, mul;
		boolean[] primeCheck;
		StringTokenizer input;
		
		input = new StringTokenizer(br.readLine());
		M = Integer.parseInt(input.nextToken());
		N = Integer.parseInt(input.nextToken());
		primeCheck = new boolean[N + 1];
		Arrays.fill(primeCheck, true);
		for(int i = 2; i <= N; i++) {
			if(primeCheck[i]) {
				mul = i * 2;
				while(mul <= N) {
					primeCheck[mul] = false;
					mul += i;
				}
				if(i >= M)
					bw.write(i + "\n");
			}
		}
		bw.flush();	
	}		
}
