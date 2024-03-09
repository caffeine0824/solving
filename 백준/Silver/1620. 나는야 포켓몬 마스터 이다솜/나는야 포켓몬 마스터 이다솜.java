import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N, M, top, bottom, mid;
		boolean find;
		String question, nameToCompare;
		String[] book, numberingBook;
		StringTokenizer input;
		
		input = new StringTokenizer(br.readLine());
		N = Integer.parseInt(input.nextToken());
		M = Integer.parseInt(input.nextToken());
		book = new String[N];
		numberingBook = new String[N];
		for(int i = 0; i < N; i++) {
			book[i] = br.readLine();
			numberingBook[i] = book[i] + " " + (i + 1);
		}
		Arrays.sort(numberingBook);
		
		for(int i = 0; i < M; i++) {
			question = br.readLine();
			top = N;
			bottom = -1;
			if(question.compareToIgnoreCase("a") < 0) {
				bw.write(book[Integer.parseInt(question) - 1] + "\n");
			}
			else {
				while(top - bottom > 1) {
					mid = (top + bottom) / 2;
					input = new StringTokenizer(numberingBook[mid]);
					nameToCompare = input.nextToken();
					if(question.compareToIgnoreCase(nameToCompare) < 0) {
						top = mid;
					}
					else if(question.compareToIgnoreCase(nameToCompare) > 0) {
						bottom = mid;
					}
					else if(question.compareToIgnoreCase(nameToCompare) == 0) {
						bw.write(input.nextToken() + "\n");
						break;
					}
					
				}
			}
		}
		
		bw.flush();
	}		
}
