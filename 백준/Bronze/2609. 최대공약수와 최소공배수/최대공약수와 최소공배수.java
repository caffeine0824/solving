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
		
		int X, Y, max, min;
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		X = Integer.parseInt(st.nextToken());
		Y = Integer.parseInt(st.nextToken());
		max = 0;
		min = 0;
		
		for(int i = (X < Y ? X : Y); i > 0; i--)
			if((X % i == 0) && (Y % i) == 0) {
				max = i;
				break;
			}
		for(int i = (X > Y ? X : Y); i <= X * Y; i++)
			if((i % X == 0) && (i % Y == 0)) {
				min = i;
				break;
			}
		bw.write(max + "\n" + min);
		bw.flush();
	}		
}