import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
	static class Memo implements Comparable<Memo>{
		String address, password;
		@Override
		public int compareTo(Memo memo) {
			return this.address.compareTo(memo.address);
		}
	}
	
	public static void main(String[] args) throws IOException, InterruptedException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N, M, hi, lo, mid;
		String address2FindPw;
		StringTokenizer st;
		Memo[] memo;
		
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		memo = new Memo[N];
		for(int i = 0; i < N; i++) {
			memo[i] = new Memo();
			st = new StringTokenizer(br.readLine());
			memo[i].address = st.nextToken();
			memo[i].password = st.nextToken();
		}
		Arrays.sort(memo);
		for(int i = 0; i < M; i++) {
			address2FindPw = br.readLine();
			hi = N;
			lo = -1;
			mid = (hi + lo) / 2;
			while(hi - lo > 1) {
				if(address2FindPw.compareTo(memo[mid].address) == 0) {
					bw.write(memo[mid].password + "\n");
					break;
				}
				else if(address2FindPw.compareTo(memo[mid].address) < 0)
					hi = mid;
				else if(address2FindPw.compareTo(memo[mid].address) > 0)
					lo = mid;
				mid = (hi + lo) / 2;
			}
		}
		
		bw.flush();
	}	
}
