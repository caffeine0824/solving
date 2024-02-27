import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer str = new StringTokenizer(br.readLine());
		long A, B, C;
		A = Long.parseLong(str.nextToken());
		B = Long.parseLong(str.nextToken());
		C = Long.parseLong(str.nextToken());
		System.out.print(A + B + C);
	}		
}