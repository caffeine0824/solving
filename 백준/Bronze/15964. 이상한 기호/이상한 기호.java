import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {

	private static long calculate(long A, long B) {
		return (A + B) * (A - B);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		long A, B;
		StringTokenizer input = new StringTokenizer(br.readLine());
		A = Long.parseLong(input.nextToken());
		B = Long.parseLong(input.nextToken());
		
		bw.write(calculate(A, B) + "");
		
		bw.flush();
	}		
}
