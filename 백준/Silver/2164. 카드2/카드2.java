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
		
		int N, head, tail, size;
		int[] queue;
		boolean del;
		
		N = Integer.parseInt(br.readLine());
		queue = new int[N];
		for(int i = 0; i < N; i++)
			queue[i] = i + 1;
		head = 0;
		size = N;
		tail = 0;
		del = true;
		
		while(size != 1) {
			if(del) {
				if(head == (N - 1))
					head = 0;
				else
					head++;
				size--;
				del = false;
			}
			else {
				queue[tail] = queue[head];
				if(head == (N - 1))
					head = 0;
				else
					head++;
				if(tail == (N - 1))
					tail = 0;
				else
					tail++;
				del = true;
			}
		}
		bw.write(queue[head] + "");
		
		
		bw.flush();
	}		
}
