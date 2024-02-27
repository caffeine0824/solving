import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int H, M;
		H = input.nextInt();
		M = input.nextInt();
		if (M >= 45)
			M -= 45;
		else if (H > 0) {
			H -= 1;
			M += 15;
		}
		else if (H == 0) {
			H = 23;
			M += 15;
		}
		System.out.print(H + " " + M);
	}

}
