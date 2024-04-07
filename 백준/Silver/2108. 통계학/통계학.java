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
		
		int N, input, mostFreq, freqVal;
		int[] arr, freq;
		double ave;
		boolean secondVal;
		
		N = Integer.parseInt(br.readLine());
		arr = new int[N];
		freq = new int[8001];
		ave = 0;
		for(int i = 0; i < N; i++) {
			input = Integer.parseInt(br.readLine());
			ave += input;
			arr[i] = input;
			freq[input + 4000]++;
		}
		ave /= N;
		bw.write(Math.round(ave) + "\n");
		Arrays.sort(arr);
		bw.write(arr[N / 2] + "\n");
		mostFreq = -1;
		freqVal = 0;
		secondVal = false;
		for(int i = 0; i < 8001; i++) {
			if(freqVal < freq[i]) {
				mostFreq = i;
				freqVal = freq[i];
				secondVal = false;
			}
			else if((freqVal == freq[i]) && !secondVal) {
				secondVal = true;
				mostFreq = i;
			}
		}
		bw.write(mostFreq - 4000 + "\n");
		bw.write(arr[N - 1] - arr[0] + "");
		bw.flush();
	}	
}
