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
		
		int[] input;
		String color;
		
		input = new int[3];
		for(int i = 0; i < 3; i++) {
			color = br.readLine();
			if(color.equals("black"))
				input[i] = 0;
			if(color.equals("brown"))
				input[i] = 1;
			if(color.equals("red"))
				input[i] = 2;
			if(color.equals("orange"))
				input[i] = 3;
			if(color.equals("yellow"))
				input[i] = 4;
			if(color.equals("green"))
				input[i] = 5;
			if(color.equals("blue"))
				input[i] = 6;
			if(color.equals("violet"))
				input[i] = 7;
			if(color.equals("grey"))
				input[i] = 8;
			if(color.equals("white"))
				input[i] = 9;
		}
		bw.write((long)((input[0] * 10 + input[1]) * Math.pow(10, input[2])) + "");
		bw.flush();
	}	
}