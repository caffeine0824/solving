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

		int K, N, maxLength, minLength ,lengthN, cutK;
		int[] lengthK;
		StringTokenizer input;
		
		input = new StringTokenizer(br.readLine());
		K = Integer.parseInt(input.nextToken());
		N = Integer.parseInt(input.nextToken());
		
		lengthK = new int[K];
		maxLength = 0;
		for(int i = 0; i < K; i++) {
			lengthK[i] = Integer.parseInt(br.readLine());
			if(maxLength < lengthK[i]) {
				maxLength = lengthK[i];
			}
		}
		minLength = 0;
		
		lengthN = maxLength;
		while(!((maxLength - minLength) <= 1)) {
			cutK = 0;
			for(int i = 0; i < K; i++) {
				cutK += lengthK[i] / lengthN;
			}
			if(cutK >= N) {
				minLength = lengthN;
				lengthN += ((maxLength - lengthN) / 2);
			}
			else {
				maxLength = lengthN;
				lengthN -= ((lengthN - minLength) / 2) + 1;
			}
		}
		
		bw.write(lengthN + "\n");
		
		bw.flush();
	}		
}
