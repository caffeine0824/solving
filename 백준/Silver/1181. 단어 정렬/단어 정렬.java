import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N;
		String[] inputArr;
		
		N = Integer.parseInt(br.readLine());
		inputArr = new String[N];
		for(int i = 0; i < N; i++) {
			inputArr[i] = br.readLine();
		}
		Arrays.sort(inputArr);
		Arrays.sort(inputArr,new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s1.length() - s2.length();
			}
		});
		for(int i = 0; i < N; i++) {
			if((i != 0) && inputArr[i].equals((inputArr)[i - 1])) {
				N--;
				for(int j = i; j < N; j++) {
					inputArr[j] = inputArr[j + 1];
				}
				i--;
			}
		}
		for(int i = 0; i < N; i++) {
			bw.write(inputArr[i] + "\n");
		}
		bw.flush();	
	}		
}
