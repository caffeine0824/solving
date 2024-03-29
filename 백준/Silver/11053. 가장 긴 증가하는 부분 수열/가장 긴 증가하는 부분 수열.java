import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
	static int[] A, memo;
	public static void cal(int i) {
		for(int j = i + 1; j < A.length; j++)
			if ((A[j] > A[i]) && (memo[j] + 1 > memo[i]))
				memo[i] = memo[j] + 1;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N, maxLength;
		StringTokenizer st;
		
		N = Integer.parseInt(br.readLine());
		A = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++)
			A[i] = Integer.parseInt(st.nextToken());
		memo = new int[N];
		Arrays.fill(memo, 1);
		for(int i = N - 1; i >= 0; i--)
			cal(i);
		maxLength = 0;
		for(int i = 0; i < N; i++)
			maxLength = memo[i] > maxLength ? memo[i] : maxLength;
		bw.write(maxLength + "");
		bw.flush();
	}	
}
