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
		
		int N, count, number, doomCount;
		String strNumber;
		
		N = Integer.parseInt(br.readLine());
		
		count = 0;
		number = 0;
		while(N > count) {
			number++;
			strNumber = Integer.toString(number);
			doomCount = 0;
			for(int i = 0; i < strNumber.length(); i++) {
				if(strNumber.charAt(i) == '6') {
					doomCount++;
				}
				else
					doomCount = 0;
				if(doomCount == 3) {
					count++;
					break;
				}
			}
		}
		bw.write(number + "");
		bw.flush();	
	}		
}
