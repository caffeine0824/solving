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
		
		int T, N, M, input, head, tail, priority, count;
		int[] queue, checkList;
		StringTokenizer st;
		
		T = Integer.parseInt(br.readLine());
		for(int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			queue = new int[N];
			head = 0;
			tail = 0;
			checkList = new int[10];
			priority = 0;
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < N; j ++) {
				input = Integer.parseInt(st.nextToken());
				checkList[input]++;
				if(input > priority)
					priority = input;
				queue[j] = input;
			}
			count = 1;
			while(true) {
				if(queue[head] == priority) {
					if(head == M) {
						bw.write(count + "\n");
						break;
					}
					else {
						head++;
						if(head == N)
							head = 0;
						count++;
						checkList[priority]--;
						while(checkList[priority] == 0)
							priority--;
					}
				}
				else {
					queue[tail] = queue[head];
					if(head == M)
						M = tail;
					head++;
					if(head == N)
						head = 0;
					tail++;
					if(tail == N)
						tail = 0;
				}
			}
			
		}
		bw.flush();
	}	
}
