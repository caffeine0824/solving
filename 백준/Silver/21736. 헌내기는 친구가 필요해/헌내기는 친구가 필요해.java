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
		
		int N, M, count;
		int[][] campus;
		boolean run;
		String input;
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		campus = new int[N][M];
		for(int i = 0; i < N; i++) {
			input = br.readLine();
			for(int j = 0; j < M; j++) {
				if(input.charAt(j) == 'O')
					campus[i][j] = 0;
				else if(input.charAt(j) == 'X')
					campus[i][j] = -1;
				else if(input.charAt(j) == 'I')
					campus[i][j] = 2;
				else if(input.charAt(j) == 'P')
					campus[i][j] = 1;
			}
		}
		run = true;
		count = 0;
		while(run) {
			run = false;
			for(int i = 0; i < N; i++)
				for(int j = 0; j < M; j++) {
					if(campus[i][j] == 2) {
						if((i > 0) && (campus[i - 1][j] != -1) && (campus[i - 1][j] != 2)) {
							if(campus[i - 1][j] == 1)
								count++;
							campus[i - 1][j] = 2;
							run = true;
						}
						if((i < N - 1) && (campus[i + 1][j] != -1) && (campus[i + 1][j] != 2)) {
							if(campus[i + 1][j] == 1)
								count++;
							campus[i + 1][j] = 2;
							run = true;
						}
						if((j > 0) && (campus[i][j - 1] != -1) && (campus[i][j - 1] != 2)) {
							if(campus[i][j - 1] == 1)
								count++;
							campus[i][j - 1] = 2;
							run = true;
						}
						if((j < M - 1) && (campus[i][j + 1] != -1) && (campus[i][j + 1] != 2)) {
							if(campus[i][j + 1] == 1)
								count++;
							campus[i][j + 1] = 2;
							run = true;
						}
					}
				}
		}
		if(count == 0)
			bw.write("TT");
		else
			bw.write(count + "");
		bw.flush();
	}	
}