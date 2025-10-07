import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N, workTime, max, min, work;
        String name;
        StringTokenizer st;
        HashMap<String, Integer> hashMap;

        N = Integer.parseInt(br.readLine());
        hashMap = new HashMap<>();
        for(int i = 0; i < N; i++)
            for(int j = 0; j < 4; j++) {
                st = new StringTokenizer(br.readLine());
                if(j == 0 || j == 2)
                    workTime = 4;
                else if(j == 1)
                    workTime = 6;
                else
                    workTime = 10;
                for(int k = 0; k < 7; k++) {
                    name = st.nextToken();
                    if(!name.equals("-")) {
                        if(hashMap.containsKey(name))
                            hashMap.replace(name, hashMap.get(name) + workTime);
                        else
                            hashMap.put(name, workTime);
                    }
                }
            }
        max = Integer.MIN_VALUE;
        min = Integer.MAX_VALUE;
        for(Map.Entry<String, Integer> entry: hashMap.entrySet()) {
            work = entry.getValue();
            if(work > max)
                max = work;
            if(work < min)
                min = work;
        }
        if(max - min <= 12) 
            bw.write("Yes");
        else
            bw.write("No");
        bw.flush();
    }
}