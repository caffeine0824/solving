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
		
		int N, a1, a2, tmp, mod;
		
		N = Integer.parseInt(br.readLine());
		a1 = 0;
		a2 = 1;
		for(int i = 0; i < N; i++) {
			tmp = a2;
			a2 += a1 + 10007;
			a1 = tmp;
			a2 %= 10007;
		}
		bw.write(a2 + "\n");
		bw.flush();
	}	
}