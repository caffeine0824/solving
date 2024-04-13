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
		
		int K, top, input, sum;
		int[] stack;
		
		K = Integer.parseInt(br.readLine());
		stack = new int[K];
		top = 0;
		for(int i = 0; i < K; i++) {
			input = Integer.parseInt(br.readLine());
			if(input == 0)
				top--;
			else
				stack[top++] = input;
		}
		sum = 0;
		for(int i = 0; i < top; i++)
			sum += stack[i];
		bw.write(sum + "");
		bw.flush();
	}	
}