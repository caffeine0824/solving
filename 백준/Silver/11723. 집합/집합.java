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
		
		int M, x;
		boolean[] S;
		String command;
		StringTokenizer input;
		
		S = new boolean[20];
		Arrays.fill(S, false);
		M = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < M; i++) {
			input = new StringTokenizer(br.readLine());
			command = input.nextToken();
			if(command.equals("add"))
				S[Integer.parseInt(input.nextToken()) - 1] = true;
			if(command.equals("remove"))
				S[Integer.parseInt(input.nextToken()) - 1] = false;
			if(command.equals("check")) {
				if(S[Integer.parseInt(input.nextToken()) - 1])
					bw.write("1\n");
				else
					bw.write("0\n");
			}
			if(command.equals("toggle")) {
				x = Integer.parseInt(input.nextToken()) - 1;
				if(S[x])
					S[x] = false;
				else
					S[x] = true;
			}
			if(command.equals("all"))
				Arrays.fill(S, true);
			if(command.equals("empty"))
				Arrays.fill(S, false);
		}
		
		bw.flush();
	}		
}
