import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
	public static class Computer {
		boolean infection = false;
		boolean[] connectCheck = new boolean[101];
		Computer() {
			Arrays.fill(connectCheck, false);
		}
	}
	public static void main(String[] args) throws IOException, InterruptedException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N, M, x, y, count;
		boolean noMoreInfec;
		StringTokenizer st;
		Computer[] computers;
		
		N = Integer.parseInt(br.readLine());
		M = Integer.parseInt(br.readLine());
		computers = new Computer[N + 1];
		for(int i = 1; i <= N; i++)
			computers[i] = new Computer();
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			computers[x].connectCheck[y] = true;
			computers[y].connectCheck[x] = true;
		}
		computers[1].infection = true;
		count = 0;
		noMoreInfec = false;
		while(!noMoreInfec) {
			noMoreInfec = true;
			for(int i = 1; i <= N; i++)
				if(computers[i].infection)
					for(int j = 1; j <= N; j++)
						if(computers[i].connectCheck[j] && !computers[j].infection) {
							computers[j].infection = true;
							noMoreInfec = false;
							count++;
						}
		}
		bw.write(count + "");
		bw.flush();
	}	
}