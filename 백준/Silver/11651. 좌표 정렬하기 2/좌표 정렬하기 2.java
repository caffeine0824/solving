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
		
		int N;
		int[][] arr;
		StringTokenizer st;
		
		N = Integer.parseInt(br.readLine());
		arr = new int[N][2];
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr, new Comparator<int[]>() {
			@Override
			public int compare(int[] a1, int[] a2) {
				return a1[0] - a2[0];
			}
		});
		Arrays.sort(arr, new Comparator<int[]>() {
			@Override
			public int compare(int[] a1, int[] a2) {
				return a1[1] - a2[1];
			}
		});
		for(int i = 0; i < N; i++)
			bw.write(arr[i][0] + " " + arr[i][1] + "\n");
		bw.flush();
	}	
}