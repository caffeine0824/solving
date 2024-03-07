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
		
		int N, M, searchNumber, top, bottom, mid;
		int[] A;
		boolean find;
		StringTokenizer input;
		
		N = Integer.parseInt(br.readLine());
		A = new int[N];
		input = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++)
			A[i] = Integer.parseInt(input.nextToken());
		Arrays.sort(A);
		M = Integer.parseInt(br.readLine());
		input = new StringTokenizer(br.readLine());
		for(int i = 0; i < M; i++) {
			searchNumber = Integer.parseInt(input.nextToken());
			top = N;
			bottom = -1;
			find = false;
			while((top - bottom) > 1) {
				mid = (top + bottom) / 2;
				if(A[mid] > searchNumber)
					top = mid;
				else if(A[mid] < searchNumber)
					bottom = mid;
				else if(A[mid] == searchNumber) {
					bw.write("1\n");
					find = true;
					break;
				}
			}
			if(!find)
				bw.write("0\n");
		}
		bw.flush();	
	}		
}
