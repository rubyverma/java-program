import java.util.Scanner;

public class Program2 {
	/*
	 * 2.Value of y depends upon the value of x as: { 1 for x > 0 y = { 0 for x
	 * = 0 { -1 for x < 0 Write the above problem using if-else, nested if,
	 * switch case
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the value of x: ");
		int x = input.nextInt();
		int y;
		// using if-else
		if (x > 0) {
			y = 0;
			System.out.println("Value of y is 1");
		} else if (x == 0) {
			y = 0;
			System.out.println("Value of y is 0");
		} else if (x < 0) {
			y = -1;
			System.out.println("Value of y is -1");
		}

		// using nested-if
		if (x > 0) {
			if (x == 0) {
				if (x < 0) {
					y = -1;
					System.out.println("Value of y is -1");
				}
				y = 0;
				System.out.println("Value of y is 0");
			}
			y = 1;
			System.out.println("Value of y is 1");
		}

		// using switch case
		int switchvar = x;
		if (x > 0)
			switchvar = 0;
		if (x == 0)
			switchvar = 1;
		if (x < 0)
			switchvar = 2;
		switch (switchvar) {
		case 0:
			System.out.println("Value of y is 1");
			break;
		case 1:
			System.out.println("Value of y is 0");
			break;
		case 2:
			System.out.println("Value of y is -1");
		}
	}
}
