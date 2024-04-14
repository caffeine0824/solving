import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException, InterruptedException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		boolean run, bal;
		String input;
		Stack<Integer> stack;
		
		run = true;
		
		while(run) {
			stack = new Stack<>();
			input = br.readLine();
			bal = true;
			if(input.equals("."))
				break;
			for(int i = 0; i < input.length(); i++) {
				if(input.charAt(i) == '(')
					stack.push(0);
				if(input.charAt(i) == '[')
					stack.push(1);
				if(input.charAt(i) == ')')
					if(stack.empty() || stack.pop() != 0) {
						bal = false;
						break;
					}
				if(input.charAt(i) == ']')
					if(stack.empty() || stack.pop() != 1) {
						bal = false;
						break;
					}
			}
			if(!stack.empty())
				bal = false;
			if(bal)
				bw.write("yes\n");
			else
				bw.write("no\n");
		}
		bw.flush();
	}	
}