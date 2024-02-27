import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.io.BufferedWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int count = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < count; i++) {
			StringTokenizer str = new StringTokenizer(br.readLine());
			int result = Integer.parseInt(str.nextToken()) + Integer.parseInt(str.nextToken());
			bw.write(result + "\n");
		}
		bw.flush();
	}		
}