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
		
		int N, stack, tmp, time;
		int[] P;
		StringTokenizer st;
		
		N = Integer.parseInt(br.readLine());
		P = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++)
			P[i] = Integer.parseInt(st.nextToken());
		Arrays.sort(P);
		stack = 0;
		for(int i = 0; i < N; i++) {
			tmp = P[i];
			P[i] += stack;
			stack += tmp;
		}
		time = 0;
		for(int i = 0; i < N; i++)
			time += P[i];
		
		bw.write(time + "");
		bw.flush();
	}		
}
