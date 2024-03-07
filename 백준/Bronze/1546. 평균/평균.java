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
		
		int N;
		double bestScore, newAverage;
		double[] subject;
		StringTokenizer input;
		
		N = Integer.parseInt(br.readLine());
		input = new StringTokenizer(br.readLine());
		subject = new double[N];
		bestScore = 0;
		for(int i = 0; i < N; i++) {
			subject[i] = Integer.parseInt(input.nextToken());
			if(bestScore < subject[i])
				bestScore = subject[i];
		}
		newAverage = 0;
		for(int i = 0; i < N; i++)
			newAverage += subject[i] / bestScore * 100.0;
		newAverage /= N;
		bw.write(newAverage + "");
		bw.flush();	
	}		
}