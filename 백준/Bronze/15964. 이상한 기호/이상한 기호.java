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
		
		int A, B;
		StringTokenizer input = new StringTokenizer(br.readLine());
		A = Integer.parseInt(input.nextToken());
		B = Integer.parseInt(input.nextToken());
		
		bw.write((A + B) * (A - B) + "");
		
		bw.flush();
	}		
}
