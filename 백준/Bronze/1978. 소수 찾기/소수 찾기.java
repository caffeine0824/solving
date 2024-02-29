import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int count, number, primenumberCount;
		boolean primeCheck;
		StringTokenizer input;
		
		count = Integer.parseInt(br.readLine());
		input = new StringTokenizer(br.readLine());
		primenumberCount = 0;
		
		for(int i = 0; i < count; i++) {
			primeCheck = true;
			number = Integer.parseInt(input.nextToken());
			if(number == 1)
				primeCheck = false;
			for(int j = 2; j < number; j++)
				if((number % j) == 0)
					primeCheck = false;
			if(primeCheck)
				primenumberCount++;
		}
		bw.write(primenumberCount + " ");
		bw.flush();
	}		
}