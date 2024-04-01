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
		
		int T, k, n;
		int[] room;
		
		T = Integer.parseInt(br.readLine());
		for(int i = 0; i < T; i++) {
			k = Integer.parseInt(br.readLine());
			n = Integer.parseInt(br.readLine());
			room = new int[n + 1];
			for(int j = 1; j <= n; j++)
				room[j] = j;
			for(int j = 1; j <= k; j++)
				for(int l = 1; l <= n; l++)
					room[l] += room[l - 1];
			bw.write(room[n] + "\n");
		}
		bw.flush();
	}	
}
