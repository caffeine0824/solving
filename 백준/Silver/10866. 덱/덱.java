import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException, InterruptedException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N, head, tail;
		int[] deque;
		String cmd;
		StringTokenizer st;
		
		N = Integer.parseInt(br.readLine());
		deque = new int[N + 1];
		head = 0;
		tail = 1;
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			cmd = st.nextToken();
			if(cmd.equals("push_front"))
				deque[head--] = Integer.parseInt(st.nextToken());
			else if(cmd.equals("push_back"))
				deque[tail++] = Integer.parseInt(st.nextToken());
			else if(cmd.equals("pop_front"))
				bw.write(((tail - head == 1) || ((head == N) && (tail == 0)) ? -1 :
					(head == N ? deque[head = 0] : deque[++head])) + "\n");
			else if(cmd.equals("pop_back"))
				bw.write(((tail - head == 1) || ((head == N) && (tail == 0)) ? -1 :
					(tail == 0 ? deque[tail = N] : deque[--tail])) + "\n");
			else if(cmd.equals("size"))
				bw.write((tail >= head ? tail - head - 1 : tail + N - head) + "\n");
			else if(cmd.equals("empty"))
				bw.write(((tail - head == 1) || ((head == N) && (tail == 0)) ? 1 : 0) + "\n");
			else if(cmd.equals("front"))
				bw.write(((tail - head == 1) || ((head == N) && (tail == 0)) ? -1 : 
					(head == N ? deque[0] : deque[head + 1])) + "\n");
			else if(cmd.equals("back"))
				bw.write(((tail - head == 1) || ((head == N) && (tail == 0)) ? -1 :
					(tail == 0 ? deque[N] : deque[tail - 1])) + "\n");
			if(head < 0)
				head = N;
			if(tail > N)
				tail = 0;
		}
		bw.flush();
	}	
}