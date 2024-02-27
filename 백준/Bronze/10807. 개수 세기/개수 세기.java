import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N, v, count = 0;
		
		N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		StringTokenizer inputData = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(inputData.nextToken());
		}
		v = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < N; i++) {
			if(arr[i] == v)
				count++;
		}
		
		bw.write(count + "");
		bw.flush();
	}		
}