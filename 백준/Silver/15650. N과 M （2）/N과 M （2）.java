import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
	static int N, M;
	static int[] stack;
	public static void find(int level, int V) {
		int i = 0;
		if(level >= M) {
			for(int j = 0; j < M; j++)
				System.out.print(stack[j] + " ");
			System.out.print("\n");
		}
		else
			while(V + i <= N) {
				stack[level] = V + i;
				find(level + 1, V + i + 1);
				i++;
			} 
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		stack = new int[M];
		find(0, 1);
		
		bw.flush();
	}	
}