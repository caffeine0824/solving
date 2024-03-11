import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
	static int[] memo = new int[1000001];
	
	public static int makeOne(int x) {
		int div3, div2, min1;
		div3 = 99999;
		div2 = 99999;
		if(memo[x] != 0)
			return memo[x];
		else if(x == 1)
			return 1;
		else {
			if(x % 3 == 0)
				div3 = makeOne(x / 3);
			if(x % 2 == 0)
				div2 = makeOne(x / 2);
			min1 = makeOne(x - 1);
		}
		if((div3 <= div2) && (div3 <= min1)) {
			memo[x] = div3 + 1;
			return div3 + 1;
		}
		else if((div2 <= div3) && (div2 <= min1)) {
			memo[x] = div2 + 1;
			return div2 + 1;
		}
		else {
			memo[x] = min1 + 1;
			return min1 + 1;
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int X;
		
		X = Integer.parseInt(br.readLine());
		
		bw.write((makeOne(X) - 1) + "");
		
		bw.flush();
	}		
}
