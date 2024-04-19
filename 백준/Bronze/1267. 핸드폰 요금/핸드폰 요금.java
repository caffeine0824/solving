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
		
		int N, Y, M, time;
		StringTokenizer st;
		
		N = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		Y = 0;
		M = 0;
		for(int i = 0; i < N; i++) {
			time = Integer.parseInt(st.nextToken());
			Y += (time / 30 + 1) * 10;
			M += (time / 60 + 1) * 15;
		}
		if(Y == M)
			bw.write("Y M " + Y);
		else if(Y > M)
			bw.write("M " + M);
		else if(Y < M)
			bw.write("Y " + Y);
		bw.flush();
	}	
}