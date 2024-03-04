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
		
		int input, distance, distanceMaxNumber;
		
		input = Integer.parseInt(br.readLine());
		distance = 1;
		distanceMaxNumber = 1;
		while(input > distanceMaxNumber) {
			distanceMaxNumber += distance * 6;
			distance++;
		}
		bw.write(distance + "");
		bw.flush();
		
			
	}		
}
