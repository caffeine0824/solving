import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.*;

public class Main {
    static class Meeting implements Comparable<Meeting>{
        int start;
        int end;
        Meeting (int start, int end) {
            this.start = start;
            this.end = end;
        }
        @Override
        public int compareTo(Meeting meeting) {
            if(this.end > meeting.end)
                return 1;
            else if(this.end < meeting.end)
                return -1;
            else {
                if(this.start > meeting.start)
                    return 1;
                else if(this.start < meeting.start)
                    return -1;
                else
                    return 0;
            }
        }
    }
    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N, start, end, count, nowTime;
        Meeting nowMeeting;
        StringTokenizer st;
        PriorityQueue<Meeting> meeting;

        N = Integer.parseInt(br.readLine());
        meeting = new PriorityQueue<>();
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            start = Integer.parseInt(st.nextToken());
            end = Integer.parseInt(st.nextToken());
            meeting.add(new Meeting(start, end));
        }
        count = 0;
        nowTime = 0;
        while(!meeting.isEmpty()) {
            nowMeeting = meeting.poll();
            if(nowMeeting.start >= nowTime) {
                count++;
                nowTime = nowMeeting.end;
            }
        }
        bw.write(count + "");
        bw.flush();
    }
}