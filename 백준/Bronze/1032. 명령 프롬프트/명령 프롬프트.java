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
		char c;
		char[] pattern;
		String[] file;
		
		N = Integer.parseInt(br.readLine());
		file = new String[N];
		for(int i = 0; i < N; i++)
			file[i] = br.readLine();
		pattern = new char[file[0].length()];
		for(int i = 0; i < file[0].length(); i++) {
			c = file[0].charAt(i);
			pattern[i] = c;
			for(int j = 1; j < N; j++)
				if(file[j].charAt(i) != c)
					pattern[i] = '?';
		}
		for(int i = 0; i < file[0].length(); i++)
			bw.write(pattern[i] + "");
		bw.flush();
	}	
}