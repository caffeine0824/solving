import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x1, x2, y1, y2, y3;
		x1 = input.nextInt();
		x2 = input.nextInt();
		y1 = (x2 % 10) * x1;
		y2 = ((x2 - (x2 % 10)) % 100) / 10 * x1;
		y3 = x2 / 100 * x1;
		System.out.println(y1);
		System.out.println(y2);
		System.out.println(y3);
		System.out.println(y1 + y2 * 10 + y3 * 100);
	}

}