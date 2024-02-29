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

		int count, repeat, strLength;
		String str;
		StringTokenizer input;
		
		count = Integer.parseInt(br.readLine());
		for(int i = 0; i < count; i++) {
			input = new StringTokenizer(br.readLine());
			repeat = Integer.parseInt(input.nextToken());
			str = input.nextToken();
			strLength = str.length();
			for(int j = 0; j < strLength; j++) {
				for(int k = 0; k < repeat; k++) {
					bw.write(Character.toString(str.charAt(j)));
				}
			}
			bw.write("\n");
		}
		bw.flush();
	}		
}