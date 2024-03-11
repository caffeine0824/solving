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
		
		int N, M, top, bottom, mid, dutBoJobCount;
		String bo;
		String[] dut, dutBoJob, dutBoJobArrayed;
		StringTokenizer input;
		
		input = new StringTokenizer(br.readLine());
		N = Integer.parseInt(input.nextToken());
		M = Integer.parseInt(input.nextToken());
		dutBoJobCount = 0;
		dut = new String[N];
		for(int i = 0; i < N; i++)
			dut[i] = br.readLine();
		Arrays.sort(dut);
		if(N > M)
			dutBoJob = new String[N];
		else
			dutBoJob = new String[M];
		
		for(int i = 0; i < M; i++) {
			bo = br.readLine();
			top = N;
			bottom = -1;
			while((top - bottom) > 1) {
				mid = (top + bottom) / 2;
				if(bo.compareTo(dut[mid]) > 0)
					bottom = mid;
				if(bo.compareTo(dut[mid]) < 0)
					top = mid;
				if(bo.compareTo(dut[mid]) == 0) {
					dutBoJob[dutBoJobCount] = bo;
					dutBoJobCount++;
					break;
				}
			}
		}
		bw.write(dutBoJobCount + "\n");
		dutBoJobArrayed = new String[dutBoJobCount];
		for(int i = 0; i < dutBoJobCount; i++)
			dutBoJobArrayed[i] = dutBoJob[i];
		Arrays.sort(dutBoJobArrayed);
		for(int i = 0; i < dutBoJobCount; i++)
			bw.write(dutBoJobArrayed[i] + "\n");
		bw.flush();
	}		
}
