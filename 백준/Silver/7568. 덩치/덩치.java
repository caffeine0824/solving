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
		int[][] level;
		StringTokenizer st;
		
		N = Integer.parseInt(br.readLine());
		level = new int[N][3];
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			level[i][0] = Integer.parseInt(st.nextToken());
			level[i][1] = Integer.parseInt(st.nextToken());
			level[i][2] = 1;
		}
		for(int i = 0; i < N; i++)
			for(int j = 0; j < N; j++)
				if((i != j) && (level[i][0] < level[j][0]) && (level[i][1] < level[j][1]))
					level[i][2]++;
		for(int i = 0; i < N; i++)
			bw.write(level[i][2] + " ");
		bw.flush();
	}	
}
