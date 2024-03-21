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
		
		int numberCount, operatorCount, result;
		int[] numbers, operators;
		boolean minusExist;
		String formulaStr;
		StringTokenizer st;
		
		formulaStr = br.readLine();
		st = new StringTokenizer(formulaStr, "+-", false);
		numbers = new int[formulaStr.length()];
		numberCount = 0;
		while(st.hasMoreTokens()) {
			numbers[numberCount++] = Integer.parseInt(st.nextToken());
		}
		operators = new int[formulaStr.length()];
		operatorCount = 0;
		minusExist = false;
		for(int i = 0; i < formulaStr.length(); i++) {
			if(formulaStr.charAt(i) == '-' || minusExist) {
				operators[operatorCount++] = 2;
				minusExist = true;
			}
			else if(formulaStr.charAt(i) == '+')
				operators[operatorCount++] = 1; 
		}
		result = numbers[0];
		for(int i = 0; i < operatorCount; i++) {
			if(operators[i] == 1)
				result += numbers[i + 1];
			if(operators[i] == 2)
				result -= numbers[i + 1];
		}
		bw.write(result + "");
		bw.flush();
	}	
}
