import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N, M;
        int[] buff;
        ArrayList<Integer> list;
        Set<Integer> set;
        boolean run;
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        run = true;
        set = new HashSet<>();
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++)
            set.add(Integer.parseInt(st.nextToken()));
        list = new ArrayList<>(set);
        Collections.sort(list);
        buff = new int[M];
        Arrays.fill(buff, 0);
        while (run) {
            for(int i = 0; i < M; i++)
                bw.write(list.get(buff[i]) + " ");
            bw.write("\n");
            for(int i = M - 1; i >= 0; i--) {
                buff[i]++;
                for(int j = i + 1; j < M; j++)
                    buff[j] = buff[i];
                if(buff[i] >= list.size()) {
                    if(i == 0) {
                        run = false;
                        break;
                    }
                    buff[i] = 0;
                }
                else
                    break;
            }
        }
        bw.flush();
    }
}