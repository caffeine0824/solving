import java.io.*;
import java.util.StringTokenizer;

public class Main {
    private static class Song {
        String name;
        char[] melody;
        Song(String name, char[] melody) {
            this.name = name;
            this.melody = melody;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N, M, find;
        char[] inputMelody;
        boolean same;
        String inputName, answer;
        StringTokenizer st;
        Song[] songs;

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        songs = new Song[N];
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            st.nextToken();
            inputName = st.nextToken();
            inputMelody = new char[7];
            for(int j = 0; j < 7; j++) {
                inputMelody[j] = st.nextToken().charAt(0);
            }
            songs[i] = new Song(inputName, inputMelody);
        }
        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            inputMelody = new char[3];
            for(int j = 0; j < 3; j++) {
                inputMelody[j] = st.nextToken().charAt(0);
            }
            find = 0;
            answer = "";
            for(int j = 0; j < N; j++) {
                same = true;
                for(int k = 0; k < 3; k++) {
                    if (songs[j].melody[k] != inputMelody[k]) {
                        same = false;
                    }
                }
                if(same) {
                    find++;
                    answer = songs[j].name;
                }
            }
            if(find == 1) {
                bw.write(answer + "\n");
            } 
            else if (find > 1) {
                bw.write("?\n");
            }
            else 
                bw.write("!\n");
        }
        bw.flush();
    }
}