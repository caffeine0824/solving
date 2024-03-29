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
		
		int N, K, count, i;
		int[] josh;
		boolean[] arr;
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		arr = new boolean[N + 1];
		Arrays.fill(arr, true);
		count = 0;
		i = K;
		josh = new int[N];
		while(true) {
			josh[count] = i;
			arr[i] = false;
			count++;
			if(count == N)
				break;
			for(int j = 0; j < K; j++) {
				while(!arr[i]) {
					i++;
					if(i > N)
						i = 1;
				}
				if(j < K - 1) {
					i++;
					if(i > N)
						i = 1;
				}
			}
		}
		bw.write("<");
		for(int j = 0; j < N - 1; j++)
			bw.write(josh[j] + ", ");
		bw.write(josh[N - 1] + ">");
		bw.flush();
	}	
}
