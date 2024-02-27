import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int hour, minute, time;
		hour = input.nextInt();
		minute = input.nextInt();
		time = input.nextInt();

		minute += time;
		while(minute >= 60) {
			minute -= 60;
			hour += 1;
		}
		while(hour >= 24) {
			hour -= 24;
		}
		System.out.printf("%d %d", hour, minute);
	}
}
