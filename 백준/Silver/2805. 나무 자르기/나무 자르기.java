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
		
		int N, M, hi, lo, mid;
		long cutTree;
		int[] tree;
		boolean run;
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		tree = new int[N];
		st = new StringTokenizer(br.readLine());
		hi = 0;
		for(int i = 0; i < N; i++) {
			tree[i] = Integer.parseInt(st.nextToken());
			if(tree[i] > hi)
				hi = tree[i];
		}
		hi++;
		lo = -1;
		mid = (hi + lo) / 2;
		run = true;
		cutTree = 0;
		while(run) {
			if(hi - lo <= 1)
				run = false;
			cutTree = 0;
			for(int i = 0; i < N; i++)
				if(mid < tree[i])
					cutTree += (tree[i] - mid);
			if(cutTree >= M)
				lo = mid;
			else if(cutTree < M)
				hi = mid;
			mid = (hi + lo) / 2;
		}
		if(cutTree < M)
			mid--;
		bw.write(mid + "");
		
		bw.flush();
	}	
}
