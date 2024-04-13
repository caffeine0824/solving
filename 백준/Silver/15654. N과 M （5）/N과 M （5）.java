import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
	static int N, M;
	static int[] memo, arr;
	public static void check(int input, int order) {
		boolean wrong;
		wrong = false;
		for(int i = 0; i < order; i++) {
			if(memo[i] == input) {
				wrong = true;
				break;
			}
		}
		if(!wrong) {
			memo[order] = input;
			if(order + 1 == M) {
				for(int i = 0; i < M; i++)
					System.out.print(memo[i] + " ");
				System.out.print("\n");
			}
			else
				for(int i = 0; i < N; i++)
					check(arr[i], order + 1);
		}
	}
	public static void main(String[] args) throws IOException, InterruptedException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++)
			arr[i] = Integer.parseInt(st.nextToken());
		Arrays.sort(arr);
		memo = new int[M];
		for(int i = 0; i < N; i++)
			check(arr[i], 0);
		bw.flush();
	}	
}