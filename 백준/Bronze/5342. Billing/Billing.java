import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double cost;
        String input;

        cost = 0;
        while(!(input = br.readLine()).equals("EOI")) {
            if(input.equals("Paper"))
                cost += 57.99;
            else if(input.equals("Printer"))
                cost += 120.5;
            else if(input.equals("Planners"))
                cost += 31.25;
            else if(input.equals("Binders"))
                cost += 22.5;
            else if(input.equals("Calendar"))
                cost += 10.95;
            else if(input.equals("Notebooks"))
                cost += 11.2;
            else if(input.equals("Ink"))
                cost += 66.95;
        }

        bw.write(String.format("$%.2f", cost));
        bw.flush();
    }
}