import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N, popTimes, pushTimes, count;
		int[] array;
		boolean impossible = false;
		StringBuilder result = new StringBuilder(); 
		Stack<Integer> stack = new Stack<>();
		
		N = Integer.parseInt(br.readLine());
		array = new int[N];
		for(int i = 0; i < N; i++)
			array[i] = Integer.parseInt(br.readLine());
		
		popTimes = 0;
		count = 1;
		pushTimes = 0;
		while(popTimes < N) {
			if(stack.empty()) {
				stack.push(count++);
				pushTimes++;
				result.append("+\n");
			}
			else if(stack.peek() == array[popTimes]) {
				stack.pop();
				popTimes++;
				pushTimes--;
				result.append("-\n");
			}
			else {
				stack.push(count++);
				pushTimes++;
				result.append("+\n");
			}
			if(pushTimes > N) {
				bw.write("NO");
				impossible = true;
				break;
			}
		}
		if(!impossible)
			bw.write(result.toString());
		bw.flush();
		
			
	}		
}
