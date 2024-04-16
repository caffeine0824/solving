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
		
		int N;
		int[] A, B, P, check;
		StringTokenizer st;
		
		N = Integer.parseInt(br.readLine());
		A = new int[N];
		B = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
			B[i] = A[i];
		}
		Arrays.sort(B);
		check = new int[1001];
		for(int i = 0; i < N; i++)
			for(int j = 0; j < N; j++)
				if(A[i] == B[j]) {
					bw.write((j + check[A[i]]) + " ");
					check[A[i]]++;
					break;
				}
		bw.flush();
	}	
}