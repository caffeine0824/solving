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
		
		int N, M, head, tail, sum;
		int[] sumArr;
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		sumArr = new int[N + 1];
		sum = 0;
		for(int i = 1; i <= N; i++) {
			sum += Integer.parseInt(st.nextToken());
			sumArr[i] = sum;
		}
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			head = Integer.parseInt(st.nextToken());
			tail = Integer.parseInt(st.nextToken());
			bw.write((sumArr[tail] - sumArr[head - 1]) + "\n");
		}
		
		bw.flush();
	}	
}
