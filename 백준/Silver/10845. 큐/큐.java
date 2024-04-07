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
		
		int N, head, tail;
		int[] queue;
		String command;
		StringTokenizer st;
		
		N = Integer.parseInt(br.readLine());
		queue = new int[N + 1];
		head = 0;
		tail = 0;
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			command = st.nextToken();
			if(command.equals("push"))
				queue[tail++] = Integer.parseInt(st.nextToken());
			else if(command.equals("pop")) 
				bw.write((head != tail ? queue[head++] : -1) + "\n");
			else if(command.equals("size"))
				bw.write((tail >= head ? tail - head : tail + N + 1 - head) + "\n");
			else if(command.equals("empty"))
				bw.write((tail == head ? 1 : 0) + "\n");
			else if(command.equals("front"))
				bw.write((head != tail ? queue[head] : -1) + "\n");
			else if(command.equals("back"))
				bw.write((head != tail ? queue[tail - 1] : -1) + "\n");
			if(head == N + 1)
				head = 0;
			if(tail == N + 1)
				tail = 0;
		}
		bw.flush();
	}	
}
