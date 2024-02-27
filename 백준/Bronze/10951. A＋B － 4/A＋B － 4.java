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
		
		String input;
		
		while((input = br.readLine()) != null && !input.isEmpty()) {
			StringTokenizer str = new StringTokenizer(input);
			int result = Integer.parseInt(str.nextToken()) + Integer.parseInt(str.nextToken());
			bw.write(result + "\n");
		}
		bw.flush();
	}		
}