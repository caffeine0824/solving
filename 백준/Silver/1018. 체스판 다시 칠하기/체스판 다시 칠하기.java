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
		
		int N, M, minPaint, paint, paintReverse;
		int[][] board;
		String boardLineInput;
		StringTokenizer input;
		
		input = new StringTokenizer(br.readLine());
		N = Integer.parseInt(input.nextToken());
		M = Integer.parseInt(input.nextToken());
		board = new int[N][M];
		for(int i = 0; i < N; i++) {
			boardLineInput = br.readLine();
			for(int j = 0; j < M; j++) {
				if(boardLineInput.charAt(j) == 'B')
					board[i][j] = 1;
				else
					board[i][j] = 0;
			}
		}
		
		minPaint = 64;
		for(int i = 0; i <= (N - 8); i++) {
			for(int j = 0; j <= (M - 8); j++) {
				paint = 0;
				paintReverse = 0;
				for(int k = i; k < (i + 8); k++) {
					for(int l = j; l < (j + 8); l++) {
						if((board[i][j] == 0) && (((k - i) + (l - j)) % 2 == 0) && (board[k][l] != 0))
							paint++;
						else if((board[i][j] == 0) && (((k - i) + (l - j)) % 2 == 0) && (board[k][l] == 0))
							paintReverse++;
						else if((board[i][j] == 0) && (((k - i) + (l - j)) % 2 == 1) && (board[k][l] != 1))
							paint++;
						else if((board[i][j] == 0) && (((k - i) + (l - j)) % 2 == 1) && (board[k][l] == 1))
							paintReverse++;
						else if((board[i][j] == 1) && (((k - i) + (l - j)) % 2 == 0) && (board[k][l] != 1))
							paint++;
						else if((board[i][j] == 1) && (((k - i) + (l - j)) % 2 == 0) && (board[k][l] == 1))
							paintReverse++;
						else if((board[i][j] == 1) && (((k - i) + (l - j)) % 2 == 1) && (board[k][l] != 0))
							paint++;
						else if((board[i][j] == 1) && (((k - i) + (l - j)) % 2 == 1) && (board[k][l] == 0))
							paintReverse++;
					}
				}
				if(minPaint > paint)
					minPaint = paint;
				if(minPaint > paintReverse)
					minPaint = paintReverse;
			}
		}
		bw.write(minPaint + "");
		bw.flush();	
	}		
}
