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
		
		int N, K, head, tail, nextVal;
		int[] queue, levelQ;
		boolean[] check;
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		if(K <= N)
			bw.write((N - K) + "");
		else {
			queue = new int[1000000];
			levelQ = new int[1000000];
			check = new boolean[1000000];
			Arrays.fill(check, false);
			head = 0;
			tail = 1;
			queue[0] = N;
			levelQ[0] = 0;
			while(true) {
				nextVal = queue[head] + 1;
				if(nextVal < 1000000) {
					if(!check[nextVal]) {
						check[nextVal] = true;
						if(nextVal == K) {
							bw.write((levelQ[head] + 1) + "");
							break;
						}
						queue[tail] = nextVal;
						levelQ[tail] = levelQ[head] + 1;
						tail++;
						if(tail >= 1000000)
							tail = 0;
					}
				}
				nextVal = queue[head] - 1;
				if(nextVal >= 0) {
					if(!check[nextVal]) {
						check[nextVal] = true;
						if(nextVal == K) {
							bw.write((levelQ[head] + 1) + "");
							break;
						}
						queue[tail] = nextVal;
						levelQ[tail] = levelQ[head] + 1;
						tail++;
						if(tail >= 1000000)
							tail = 0;
					}
				}
				nextVal = queue[head] * 2;
				if(nextVal < 1000000) {
					if(!check[nextVal]) {
						check[nextVal] = true;
						if(nextVal == K) {
							bw.write((levelQ[head] + 1) + "");
							break;
						}
						queue[tail] = nextVal;
						levelQ[tail] = levelQ[head] + 1;
						tail++;
						if(tail >= 1000000)
							tail = 0;
					}
				}
				head++;
				if(head >= 1000000)
					head = 0;
			}
		}
		
		bw.flush();
	}	
}