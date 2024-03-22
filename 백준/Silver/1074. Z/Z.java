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
		
		int N, r, c, mid, result;
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		r = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		
		result = 0;
		for(int i = 0; i < N; i++) {
			mid = (int)Math.pow(2, N - (1 + i));
			if((r < mid) && (c >= mid)) {
				result += (int)Math.pow(mid, 2);
				c -= mid;
			}
			if((r >= mid) && (c < mid)) {
				result += (int)Math.pow(mid, 2) * 2;
				r -= mid;
			}
			if((r >= mid) && (c >= mid)) {
				result += (int)Math.pow(mid, 2) * 3;
				r -= mid;
				c -= mid;
			}
			
		}
		bw.write(result + "");
		bw.flush();
	}	
}
