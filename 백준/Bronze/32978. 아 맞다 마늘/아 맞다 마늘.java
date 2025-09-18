import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N;
        HashSet<String> Ingredients;
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        Ingredients = new HashSet<>();
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++)
            Ingredients.add(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N - 1; i++)
            Ingredients.remove(st.nextToken());
        Iterator<String> iterator = Ingredients.iterator();
        bw.write(iterator.next());
        bw.flush();
    }
}