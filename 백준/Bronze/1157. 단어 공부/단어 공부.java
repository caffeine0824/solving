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
		
		int ascii, max, maxIndex;
		int[] count;
		boolean same;
		String input;
		
		count = new int[26];
		input = br.readLine();
		for(int i = 0; i < input.length(); i++) {
			ascii = (int)input.charAt(i);
			if((ascii > 64) && (ascii < 91))
				count[ascii - 65]++;
			else
				count[ascii - 97]++;
		}
		max = 0;
		maxIndex = -1;
		same = false;
		for(int i = 0; i < 26; i++) {
			if(count[i] > max) {
				max = count[i];
				maxIndex = i;
				same = false;
			}
			else if(count[i] == max)
				same = true;
		}
		if(same)
			bw.write("?");
		else
			bw.write((char)(maxIndex + 65) + "");
		bw.flush();
	}	
}
