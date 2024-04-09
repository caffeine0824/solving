import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.TreeSet;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException, InterruptedException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T, score, before;
		String input;
		
		T = Integer.parseInt(br.readLine());
		for(int i = 0; i < T; i++) {
			input = br.readLine();
			score = 0;
			before = 0;
			for(int j = 0; j < input.length(); j++) {
				if(input.charAt(j) == 'O')
					score += ++before;
				else
					before = 0;
			}
			bw.write(score + "\n");
		}
		bw.flush();
	}	
}
