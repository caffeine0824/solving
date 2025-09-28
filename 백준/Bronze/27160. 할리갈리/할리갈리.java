import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N, number;
        int[] count;
        boolean ddang;
        String fruit;
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        count = new int[4];
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            fruit = st.nextToken();
            number = Integer.parseInt(st.nextToken());
            if(fruit.equals("STRAWBERRY"))
                count[0] += number;
            else if(fruit.equals("BANANA"))
                count[1] += number;
            else if(fruit.equals("LIME"))
                count[2] += number;
            else if(fruit.equals("PLUM"))
                count[3] += number;
        }
        ddang = false;
        for(int i = 0; i < count.length; i++)
            if(count[i] == 5)
                ddang = true;
        if(ddang)
            bw.write("YES");
        else
            bw.write("NO");
        bw.flush();
    }
}