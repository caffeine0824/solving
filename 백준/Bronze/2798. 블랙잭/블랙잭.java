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
		
		int N, M, max, sum;
		int[] card;
		StringTokenizer input;
		
		input = new StringTokenizer(br.readLine());
		N = Integer.parseInt(input.nextToken());
		M = Integer.parseInt(input.nextToken());
		card = new int[N];
		input = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++)
			card[i] = Integer.parseInt(input.nextToken());
		max = 0;
		for(int i = 0; i < N; i++)
			for(int j = 0; j < N; j++)
				for(int k = 0; k < N; k++)
					if((i != j) && (j != k) && (i != k)) {
						sum = card[i] + card[j] + card[k];
						if((sum > max) && (sum <= M))
							max = sum;
					}
		bw.write(max + "");
		bw.flush();	
	}		
}
