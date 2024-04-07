import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException, InterruptedException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N, M, u, v;
		int[] vertex;
		boolean run;
		boolean[][] edge;
		StringTokenizer st;
		List<Integer> chunk;
		
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		edge = new boolean[N + 1][N + 1];
		for(boolean[] i : edge)
			Arrays.fill(i, false);
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			u = Integer.parseInt(st.nextToken());
			v = Integer.parseInt(st.nextToken());
			edge[u][v] = true;
			edge[v][u] = true;
		}
		vertex = new int[N + 1];
		for(int i = 1; i <= N; i++)
			vertex[i] = i;
		run = true;
		while(run) {
			run = false;
			for(int i = 1; i <= N; i++)
				for(int j = 1; j <= N; j++)
					if(edge[i][j] && (vertex[i] != vertex[j])) {
						vertex[i] = vertex[i] < vertex[j] ? vertex[i] : vertex[j];
						run = true;
					}
		}
		chunk = new ArrayList<Integer>();
		for(int i = 1; i <= N; i++)
			if(!chunk.contains(vertex[i]))
				chunk.add(vertex[i]);
		bw.write(chunk.size() + "");
		bw.flush();
	}	
}
