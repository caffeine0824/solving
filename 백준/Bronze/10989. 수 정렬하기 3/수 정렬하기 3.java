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
		
		int N;
		int[] arr;
		
		N = Integer.parseInt(br.readLine());
		arr = new int[N];
		for(int i = 0; i < N; i++)
			arr[i] = Integer.parseInt(br.readLine());
		Arrays.sort(arr);
		for(int i = 0; i < N; i++)
			bw.write(arr[i] + "\n");
		bw.flush();
	}	
}
