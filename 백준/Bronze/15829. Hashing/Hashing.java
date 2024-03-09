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
		
		int L;
		long hash;
		long [] strLong;
		String str;
		
		L = Integer.parseInt(br.readLine());
		str = br.readLine();
		strLong = new long[L];
		hash = 0;
		for(int i = 0; i < L; i++)
			hash += ((long)str.charAt(i) - 96) * (Math.pow(31, i));
		hash %= 1234567891;
			
		bw.write(hash + "");
		bw.flush();
		
			
	}		
}
