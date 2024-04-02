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
		
		String input;
		input = br.readLine();
		if(input.equals("1 2 3 4 5 6 7 8"))
			bw.write("ascending");
		else if(input.equals("8 7 6 5 4 3 2 1"))
			bw.write("descending");
		else
			bw.write("mixed");
		bw.flush();
	}	
}
