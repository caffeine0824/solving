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
		
		int N, K, coin, count;
		int[] A;
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		A = new int[N];
		
		for(int i = 0; i < N; i++)
			A[i] = Integer.parseInt(br.readLine());
		
		coin = 0;
		for(int i = N - 1; i >= 0; i--) {
			count = K / A[i];
			coin += count;
			K -= A[i] * count;
			if(K == 0)
				break;
		}
		
		bw.write(coin + "");
		bw.flush();
	}		
}
