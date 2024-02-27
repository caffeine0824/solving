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
		StringTokenizer input = new StringTokenizer(br.readLine());
		int N, X;
		
		N = Integer.parseInt(input.nextToken());
		X = Integer.parseInt(input.nextToken());
		
		input = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			int output = Integer.parseInt(input.nextToken());
			if(X > output) {
				bw.write(output + " ");
			}
		}
		
		bw.flush();
	}		
}