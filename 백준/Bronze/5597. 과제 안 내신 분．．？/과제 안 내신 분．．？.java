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
		
		String input;
		
		boolean[] checklist = new boolean[30];
		for(int i = 0; i < 30; i++)
			checklist[i] = false;
		
		while((input = br.readLine()) != null && !input.isEmpty())
			checklist[Integer.parseInt(input) - 1] = true;
		
		for(int i = 0; i < 30; i++)
			if(!checklist[i])
				bw.write((i + 1) + "\n");
		
		bw.flush();
	}		
}