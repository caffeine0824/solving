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
		
		int N, F, output;
		
		N = Integer.parseInt(br.readLine());
		F = Integer.parseInt(br.readLine());
		N = N - N % 100;
		output = 0;
		for(int i = 0; i < 100; i++)
			if((N + i) % F == 0) {
				output = i;
				break;
			}
		System.out.printf("%02d", output);
		bw.flush();
	}	
}