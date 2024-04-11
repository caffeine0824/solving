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
		
		int[] arr;
		String input;
		
		input = br.readLine();
		arr = new int[26];
		Arrays.fill(arr, -1);
		for(int i = 0; i < input.length(); i++)
			if(arr[input.charAt(i) - 97] == -1) 
				arr[input.charAt(i) - 97] = i;
		for(int i = 0; i < 26; i++)
			bw.write(arr[i] + " ");
		bw.flush();
	}	
}