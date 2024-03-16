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
		
		int N, M, top, bottom, mid, loTop, loBottom, loMid, hiTop, hiBottom, hiMid, count;
		int[] arrN, arrM;
		boolean find;
		StringTokenizer st;
		
		N = Integer.parseInt(br.readLine());
		arrN = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++)
			arrN[i] = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(br.readLine());
		arrM = new int[M];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < M; i++)
			arrM[i] = Integer.parseInt(st.nextToken());
		
		Arrays.sort(arrN);
		for(int i = 0; i < M; i++) {
			top = N;
			bottom = -1;
			mid = (top + bottom) / 2;
			count = 0;
			find = false;
			while((top - bottom) > 1) {
				if(arrN[mid] == arrM[i]) {
					find = true;
					break;
				}
				else if(arrN[mid] > arrM[i])
					top = mid;
				else if(arrN[mid] < arrM[i])
					bottom = mid;
				mid = (top + bottom) / 2;
			}
			if(find) {
				loTop = mid;
				loBottom = -1;
				while((loTop - loBottom) > 1) {
					loMid = (loTop + loBottom) / 2;
					if(arrN[loMid] == arrM[i])
						loTop = loMid;
					else if(arrN[loMid] < arrM[i])
						loBottom = loMid;
				}
				hiTop = N;
				hiBottom = mid;
				while((hiTop - hiBottom) > 1) {
					hiMid = (hiTop + hiBottom) / 2;
					if(arrN[hiMid] > arrM[i])
						hiTop = hiMid;
					else if(arrN[hiMid] == arrM[i])
						hiBottom = hiMid;
				}
				count = hiBottom - loBottom;
			}
			bw.write(count + " ");
		}
		bw.flush();
	}	
}
