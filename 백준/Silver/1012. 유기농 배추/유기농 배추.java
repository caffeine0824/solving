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
		
		int T, M, N, K, x, y, count;
		int[][] field;
		boolean check;
		boolean[] wormNum;
		StringTokenizer st;
		
		T = Integer.parseInt(br.readLine());
		for(int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			M = Integer.parseInt(st.nextToken());
			N = Integer.parseInt(st.nextToken());
			K = Integer.parseInt(st.nextToken());
			field = new int[N][M];
			for(int j = 1; j <= K; j++) {
				st = new StringTokenizer(br.readLine());
				x = Integer.parseInt(st.nextToken());
				y = Integer.parseInt(st.nextToken());
				field[y][x] = j;
			}
			check = false;
			while(!check) {
				check = true;
				for(int j = 0; j < N; j++)
					for(int k = 0; k < M; k++)
						if(field[j][k] > 0) {
							if((j > 0) && (field[j - 1][k] > 0) && (field[j - 1][k] > field[j][k])) {
								field[j - 1][k] = field[j][k];
								check = false;
							}
							if((j < N - 1) && (field[j + 1][k] > 0) && (field[j + 1][k] > field[j][k])) {
								field[j + 1][k] = field[j][k];
								check = false;
							}
							if((k > 0) && (field[j][k - 1] > 0) && (field[j][k - 1] > field[j][k])) {
								field[j][k - 1] = field[j][k];
								check = false;
							}
							if((k < M - 1) && (field[j][k + 1] > 0) && (field[j][k + 1] > field[j][k])) {
								field[j][k + 1] = field[j][k];
								check = false;
							}
						}
			}
			wormNum = new boolean[K + 1];
			Arrays.fill(wormNum, false);
			for(int j = 0; j < N; j++)
				for(int k = 0; k < M; k++)
					if(field[j][k] > 0)
						wormNum[field[j][k]] = true;
			count = 0;
			for(int j = 1; j <= K; j++)
				if(wormNum[j])
					count++;
			bw.write(count + "\n");
		}
		bw.flush();
	}	
}