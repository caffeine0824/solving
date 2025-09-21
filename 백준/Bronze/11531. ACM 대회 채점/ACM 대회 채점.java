import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int penalty, time, correct;
        boolean judge;
        String log, name, judgeStr;
        ArrayList<String> wrongList;
        StringTokenizer st;

        correct = 0;
        penalty = 0;
        wrongList = new ArrayList<>();
        while(true) {
            log = br.readLine();
            if(log.equals("-1"))
                break;
            st = new StringTokenizer(log);
            time = Integer.parseInt(st.nextToken());
            name = st.nextToken();
            judgeStr = st.nextToken();
            if(judgeStr.equals("right"))
                judge = true;
            else
                judge = false;
            if(judge) {
                correct++;
                penalty += time;
                for(int i = 0; i < wrongList.size(); i++)
                    if(wrongList.get(i).equals(name))
                        penalty += 20;
            }
            else
                wrongList.add(name);
        }
        bw.write(correct + " " + penalty);
        bw.flush();
    }
}