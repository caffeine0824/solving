import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N, M, K, student, result;
        StringTokenizer st;
        HashMap<Integer, Integer> map;

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new HashMap<>();

        for(int i = 0; i < N; i++) {
            K = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < K; j++) {
                student = Integer.parseInt(st.nextToken());
                if(!map.containsKey(student))
                    map.put(student, 1);
                else
                    map.put(student, map.get(student) + 1);
            }
        }

        result = 0;
        for(Map.Entry<Integer, Integer> entry: map.entrySet())
            if(entry.getValue() >= M)
                result++;
        
        bw.write(result + "");
        bw.flush();
    }
}