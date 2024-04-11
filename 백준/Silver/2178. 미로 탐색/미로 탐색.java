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
		
		int N, M;
		int[][] maze;
		boolean run;
		String input;
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		maze = new int[N][M];
		for(int i = 0; i < N; i++) {
			input = br.readLine();
			for(int j = 0; j < M; j++)
				maze[i][j] = input.charAt(j) - 49;
		}
		maze[0][0] = 1;
		run = true;
		while(run) {
			run = false;
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < M; j++) {
					if(maze[i][j] > 0) {
						if(i > 0 && maze[i - 1][j] != -1 && (maze[i - 1][j] == 0 || maze[i - 1][j] > maze[i][j] + 1)) {
							maze[i - 1][j] = maze[i][j] + 1;
							run = true;
						}
						if(i < N - 1 && maze[i + 1][j] != -1 && (maze[i + 1][j] == 0 || maze[i + 1][j] > maze[i][j] + 1)) {
							maze[i + 1][j] = maze[i][j] + 1;
							run = true;
						}
						if(j > 0 && maze[i][j - 1] != -1 && (maze[i][j - 1] == 0 || maze[i][j - 1] > maze[i][j] + 1)) {
							maze[i][j - 1] = maze[i][j] + 1;
							run = true;
						}
						if(j < M - 1 && maze[i][j + 1] != -1 && (maze[i][j + 1] == 0 || maze[i][j + 1] > maze[i][j] + 1)) {
							maze[i][j + 1] = maze[i][j] + 1;
							run = true;
						}
					}
				}
			}
		}
		bw.write(maze[N - 1][M - 1] + "");
		bw.flush();
	}	
}