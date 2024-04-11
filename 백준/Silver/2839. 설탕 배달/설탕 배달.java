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

		int N, result;
		
		N = Integer.parseInt(br.readLine());
		result = -1;
		for(int i = N / 5; i >= 0; i--)
			if((N - i * 5) % 3 == 0) {
				result = i + (N - i * 5) / 3;
				break;
			}
		bw.write(result + "");
		bw.flush();
	}	
}