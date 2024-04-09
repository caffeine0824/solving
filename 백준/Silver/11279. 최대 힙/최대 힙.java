import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException, InterruptedException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N, cmd;
		PriorityQueue<Integer> heap;
		
		N = Integer.parseInt(br.readLine());
		heap = new PriorityQueue<>(Collections.reverseOrder());
		for(int i = 0; i < N; i++) {
			cmd = Integer.parseInt(br.readLine());
			if(cmd == 0 && !heap.isEmpty())
				bw.write(heap.poll() + "\n");
			else if(cmd == 0 && heap.isEmpty())
				bw.write("0\n");
			else
				heap.add(cmd);
		}
		bw.flush();
	}	
}