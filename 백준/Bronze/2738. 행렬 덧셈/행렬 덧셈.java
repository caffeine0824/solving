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
		
		int lengthX, lengthY;
		
		StringTokenizer lengthInput = new StringTokenizer(br.readLine());
		lengthY = Integer.parseInt(lengthInput.nextToken());
		lengthX = Integer.parseInt(lengthInput.nextToken());
		
		int[][] matrix = new int[lengthY][lengthX];
		for(int i = 0; i < lengthY; i++) {
			StringTokenizer input = new StringTokenizer(br.readLine());
			for(int j = 0; j < lengthX; j++) {
				matrix[i][j] = Integer.parseInt(input.nextToken());
			}
		}
		for(int i = 0; i < lengthY; i++) {
			StringTokenizer input = new StringTokenizer(br.readLine());
			for(int j = 0; j < lengthX; j++) {
				matrix[i][j] += Integer.parseInt(input.nextToken());
			}
		}
		for(int i = 0; i < lengthY; i++) {
			for(int j = 0; j < lengthX; j++) {
				bw.write(matrix[i][j] + " ");
			}
			bw.write("\n");
		}
		bw.flush();
	}		
}