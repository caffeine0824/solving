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
		
		int n, ext, ave;
		int[] opi;
		
		n = Integer.parseInt(br.readLine());
		opi = new int[n];
		for(int i = 0; i < n; i++)
			opi[i] = Integer.parseInt(br.readLine());
		Arrays.sort(opi);
		ext = (int)Math.round((double)n * 0.15);
		ave = 0;
		for(int i = ext; i < n - ext; i++)
			ave += opi[i];
		ave = (int)Math.round((double)ave / (double)(n - ext * 2));
		bw.write(ave + "");
		bw.flush();
	}	
}