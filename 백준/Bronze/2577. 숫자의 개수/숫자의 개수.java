import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int result;
		int[] count;
		
		result = 1;
		for(int i = 0; i < 3; i++)
			result *= Integer.parseInt(br.readLine());
		count = new int[10];
		for(int i = 0; i < Integer.toString(result).length(); i++)
			count[(int)Integer.toString(result).charAt(i) - 48]++;
		for(int i = 0; i < 10; i++)
			bw.write(count[i] + "\n");
		bw.flush();
	}	
}
