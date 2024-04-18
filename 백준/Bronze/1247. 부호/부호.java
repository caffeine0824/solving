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
		
		int N, carry;
		int[] sum, min;
		String result;
		String input;
		
		for(int i = 0; i < 3; i++) {
			N = Integer.parseInt(br.readLine());
			sum = new int[100];
			min = new int[100];
			for(int j = 0; j < N; j++) {
				input = br.readLine();
				if(input.charAt(0) == '-')
					for(int k = 0; k < input.length() - 1; k++) {
						min[k] += input.charAt(input.length() - 1 - k) - 48;
						carry = k;
						while(min[carry] >= 10) {
							min[carry] -= 10;
							min[++carry]++;
						}
					}
				else
					for(int k = 0; k < input.length(); k++) {
						sum[k] += input.charAt(input.length() - 1 - k) - 48;
						carry = k;
						while(sum[carry] >= 10) {
							sum[carry] -= 10;
							sum[++carry]++;
						}
					}
			}
			result = "0\n";
			for(int j = 99; j >= 0; j--) {
				if(sum[j] > min[j]) {
					result = "+\n";
					break;
				}
				if(sum[j] < min[j]) {
					result = "-\n";
					break;
				}
			}
			bw.write(result);
		}
		bw.flush();
	}	
}