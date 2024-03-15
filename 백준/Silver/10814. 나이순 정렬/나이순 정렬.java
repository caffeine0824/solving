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
		
		int N;
		int[] age;
		String[] name;
		StringTokenizer st;
		
		N = Integer.parseInt(br.readLine());
		age = new int[N];
		name = new String[N];
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			age[i] = Integer.parseInt(st.nextToken());
			name[i] = st.nextToken();
		}
		for(int i = 1; i < 201; i++) {
			for(int j = 0; j < N; j++) {
				if(age[j] == i) {
					bw.write(age[j] + " " + name[j] + "\n");
				}
			}
		}
		bw.flush();
	}		
}
