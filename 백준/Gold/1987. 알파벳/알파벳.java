import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.*;

public class Main {
    static int deepest;
    static int[][] map;
    static boolean[] check;
    public static class Loc {
        int x;
        int y;
        Loc(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    static void search(Loc nowLoc, int depth) {
        //System.out.println(nowLoc.x + " " + nowLoc.y);
        check[map[nowLoc.y][nowLoc.x]] = true;
        deepest = Math.max(depth, deepest);
        if(!check[map[nowLoc.y][nowLoc.x + 1]])
            search(new Loc(nowLoc.x + 1, nowLoc.y), depth + 1);
        if(!check[map[nowLoc.y][nowLoc.x - 1]])
            search(new Loc(nowLoc.x - 1, nowLoc.y), depth + 1);
        if(!check[map[nowLoc.y + 1][nowLoc.x]])
            search(new Loc(nowLoc.x, nowLoc.y + 1), depth + 1);
        if(!check[map[nowLoc.y - 1][nowLoc.x]])
            search(new Loc(nowLoc.x, nowLoc.y - 1), depth + 1);
        check[map[nowLoc.y][nowLoc.x]] = false;
    }
    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int R, C;
        String input;
        StringTokenizer st;
        Loc nowLoc;

        st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        map = new int[R + 2][C + 2];
        for(int[] i : map)
            Arrays.fill(i, 0);
        for(int i = 1; i <= R; i++) {
            input = br.readLine();
            for(int j = 1; j <= C; j++)
                map[i][j] = (int)(input.charAt(j - 1) - 64);
        }
        /*for(int[] i : map) {
            for(int j : i)
                System.out.print(j + "");
            System.out.print('\n');
        }*/
        check = new boolean[27];
        Arrays.fill(check, false);
        check[0] = true;
        nowLoc = new Loc(1, 1);
        deepest = 0;
        search(nowLoc, 1);
        bw.write(deepest + "");
        bw.flush();
    }
}