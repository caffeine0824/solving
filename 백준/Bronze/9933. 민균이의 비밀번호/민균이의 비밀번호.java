import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N;
        boolean find;
        String[] passwordList;

        N = Integer.parseInt(br.readLine());
        passwordList = new String[N];
        for(int i = 0; i < N; i++)
            passwordList[i] = br.readLine();
        for(int i = 0; i < N; i++)
            for(int j = i; j < N; j++)
                if(passwordList[i].length() == passwordList[j].length()) {
                    find = true;
                    for(int k = 0; k < passwordList[i].length(); k++)
                        if(passwordList[i].charAt(k) != passwordList[j].charAt((passwordList[j].length() - 1) - k)) {
                            find = false;
                            break;
                        }
                    if(find)
                        bw.write(passwordList[i].length() + " " + passwordList[i].charAt(passwordList[i].length() / 2));
                }
        bw.flush();
    }
}