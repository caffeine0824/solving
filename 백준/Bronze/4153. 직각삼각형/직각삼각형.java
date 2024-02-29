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

		int A, B, C;
		StringTokenizer input;
		
		while (true) {
			input = new StringTokenizer(br.readLine());
			A = Integer.parseInt(input.nextToken());
			B = Integer.parseInt(input.nextToken());
			C = Integer.parseInt(input.nextToken());
			if((A == 0) && (B == 0) && (C == 0))
				break;
			A *= A;
			B *= B;
			C *= C;
			if((A == B + C) || (B == A + C) || (C == A + B))
				bw.write("right\n");
			else
				bw.write("wrong\n");
		}
		bw.flush();
	}		
}
