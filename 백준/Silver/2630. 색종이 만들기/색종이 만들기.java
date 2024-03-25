import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
	static int[][] paper;
	static int white, blue;
	public static void cut(int x, int y, int N) {
		boolean oneColor = true;
		int color = paper[y][x];
		for(int i = y; i < y + N; i++)
			for(int j = x; j < x + N; j++)
				if(color != paper[i][j])
					oneColor = false;
		if(oneColor) {
			if(color == 0)
				white++;
			if(color == 1)
				blue++;
		}
		else {
			cut(x, y, N / 2); 
			cut(x + N / 2, y, N / 2);
			cut(x, y + N / 2, N / 2); 
			cut(x + N / 2, y + N / 2, N / 2);
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N;
		StringTokenizer st;
		
		N = Integer.parseInt(br.readLine());
		paper = new int[N][N];
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < N; j++)
				paper[i][j] = Integer.parseInt(st.nextToken());
		}
		white = 0;
		blue = 0;
		cut(0, 0, N);
		bw.write(white + "\n" + blue);
		bw.flush();
	}	
}
