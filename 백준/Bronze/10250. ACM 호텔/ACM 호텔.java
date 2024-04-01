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
		
		int T, H, W, N, Y, X;
		StringTokenizer st;
		
		T = Integer.parseInt(br.readLine());
		for(int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			H = Integer.parseInt(st.nextToken());
			W = Integer.parseInt(st.nextToken());
			N = Integer.parseInt(st.nextToken());
			X = N % H == 0 ? N / H : N / H + 1;
			Y = N % H == 0 ? H : N % H;
			
			if(X < 10)
				bw.write(Y + "0" + X + "\n");
			else
				bw.write(Y + "" + X + "\n");
		}
		bw.flush();
	}	
}