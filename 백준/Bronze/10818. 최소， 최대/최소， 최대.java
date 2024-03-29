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
		
		int N, max, min, input;
		StringTokenizer st;
		
		N = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		input = Integer.parseInt(st.nextToken());
		max = input;
		min = input;
		for(int i = 1; i < N; i++) {
			input = Integer.parseInt(st.nextToken());
			max = input > max ? input : max;
			min = input < min ? input : min;
		}
		bw.write(min + " " + max);
		bw.flush();
	}	
}
