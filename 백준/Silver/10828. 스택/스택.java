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
		
		int N, pointer;
		int[] stack;
		String command;
		StringTokenizer st;
		
		N = Integer.parseInt(br.readLine());
		stack = new int[10000];
		pointer = 0;
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			command = st.nextToken();
			if(command.equals("push"))
				stack[pointer++] = Integer.parseInt(st.nextToken());
			else if(command.equals("pop"))
				bw.write((pointer != 0 ? stack[--pointer] : -1) + "\n");
			else if(command.equals("size"))
				bw.write(pointer + "\n");
			else if(command.equals("empty"))
				bw.write((pointer == 0 ? 1 : 0) + "\n");
			else if(command.equals("top"))
				bw.write((pointer != 0 ? stack[pointer - 1] : -1) + "\n");
		}
		bw.flush();
	}	
}