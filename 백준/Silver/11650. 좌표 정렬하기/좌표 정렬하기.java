import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
	public static class Val implements Comparable<Val>{
		int x, y;
		@Override
		public String toString() {
			return x + " " + y + "\n";
		}
		@Override
		public int compareTo(Val val) {
			if(this.x == val.x)
				return this.y - val.y;
			else
				return this.x - val.x;
		}	
	}
	public static void main(String[] args) throws IOException, InterruptedException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N;
		Val[] val;
		StringTokenizer st;
		
		N = Integer.parseInt(br.readLine());
		val = new Val[N];
		for(int i = 0; i < N; i++)
			val[i] = new Val();
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			val[i].x = Integer.parseInt(st.nextToken());
			val[i].y = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(val);
	
		for(int i = 0; i < N; i++)
			bw.write(val[i].toString());	
		bw.flush();
	}	
}
