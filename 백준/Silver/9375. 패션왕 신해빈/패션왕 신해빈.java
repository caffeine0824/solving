import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
	public static class WearKind {
		int kind = 2;
		String name;
		WearKind (String name) {
			this.name = name;
		}
	}
	public static void main(String[] args) throws IOException, InterruptedException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T, n, result;
		boolean find;
		String kind;
		StringTokenizer st;
		List<WearKind> wears;
		
		T = Integer.parseInt(br.readLine());
		for(int i = 0; i < T; i++) {
			n = Integer.parseInt(br.readLine());
			wears = new ArrayList<WearKind>();
			result = 1;
			for(int j = 0; j < n; j++) {
				st = new StringTokenizer(br.readLine());
				st.nextToken();
				kind = st.nextToken();
				find = false;
				for(int k = 0; k < wears.size(); k++) {
					if(wears.get(k).name.equals(kind)) {
						find = true;
						wears.get(k).kind++;
						break;
					}
				}
				if(!find) {
					wears.add(new WearKind(kind));
				}
			}
			for(int j = 0; j < wears.size(); j++) {
				result *= wears.get(j).kind;
			}
			bw.write(--result + "\n");
		}
		
		bw.flush();
	}	
}
