import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
	static int N, M;
	static int[] arr;
	static Stack<Integer> stack;
	
	public static void array(int element, int order) {
		stack.add(element);
		if(order == M) {
			for(int i = 0; i < stack.size(); i++)
				System.out.print(stack.elementAt(i) + " ");
			System.out.print("\n");
		}
		else
			for(int i = 0; i < N; i++)
				if(arr[i] >= element)
					array(arr[i], order + 1);
		stack.pop();
	}
	
	public static void main(String[] args) throws IOException, InterruptedException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++)
			arr[i] = Integer.parseInt(st.nextToken());
		Arrays.sort(arr);
		stack = new Stack<>();
		for(int i = 0; i < N; i++)
			array(arr[i], 1);
		bw.flush();
	}	
}