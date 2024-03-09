import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N, M, B, top, bottom, mid, buildTime, miningTime, time, inventory, checkCount;
		int[][] field;
		StringTokenizer input;
		
		input = new StringTokenizer(br.readLine());
		N = Integer.parseInt(input.nextToken());
		M = Integer.parseInt(input.nextToken());
		B = Integer.parseInt(input.nextToken());
		top = 257;
		bottom = -1;
		field = new int[N][M];
		for(int i = 0; i < N; i++) {
			input = new StringTokenizer(br.readLine());
			for(int j = 0; j < M; j++) {
				field[i][j] = Integer.parseInt(input.nextToken());
			}
		}
		
		//너무 높으면 블럭이 없는경우 or 쌓는시간이 더 많은 경우
		//너무 낮으면 파는시간이 더 많은 경우;
		mid = (top + bottom) / 2;
		miningTime = 0;
		buildTime = 0;
		checkCount = 0;
		time = 0;
		while(((top - bottom) > 1) || (checkCount < 2)) {
			mid = (top + bottom) / 2;
			miningTime = 0;
			buildTime = 0;
			inventory = B;
			checkCount++;
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < M; j++) {
					if(field[i][j] > mid) {
						miningTime += (field[i][j] - mid) * 2;
						inventory += field[i][j] - mid;
					}
					else if(field[i][j] < mid) {
						buildTime += mid - field[i][j];
						inventory -= mid - field[i][j];
					}
				}
			}
			if((miningTime >= buildTime) && (inventory >= 0)) {
				bottom = mid;
				time = buildTime + miningTime;
			}
			else if((miningTime < buildTime) || (inventory < 0)) {
				top = mid;
			}
			//System.out.println(top + " " + bottom);
		}
		
		while(true) {
			miningTime = 0;
			buildTime = 0;
			inventory = B;
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < M; j++) {
					if(field[i][j] > (bottom + 1)) {
						miningTime += (field[i][j] - (bottom + 1)) * 2;
						inventory += field[i][j] - (bottom + 1);
					}
					else if(field[i][j] < (bottom + 1)) {
						buildTime += (bottom + 1) - field[i][j];
						inventory -= (bottom + 1) - field[i][j];
					}
				}
			}
			if((time >= buildTime + miningTime) && (inventory >= 0)) {
				time = buildTime + miningTime;
				bottom++;
			}
			else
				break;
		}
		bw.write(time + " " + bottom);
		bw.flush();
		
			
	}		
}
