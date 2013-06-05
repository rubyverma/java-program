import java.util.Scanner;

public class Program8 {

	/*
	 * 8.Electricity bill is calculated based on below conditions find the
	 * actual amount to be paid by the user.Units Cost/Unit 0-100 $1 100-300
	 * $0.75 300-500 $0.50 500> $0.25 Write program to calculate the monthly
	 * bill user needs to pay get units consumed from user?
	 */
	// with direct calculations

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of units consumed: ");
		int units = input.nextInt();
		double amount = 0;

		if (units < 0) {
			System.out.println("Units consumed cannot be less than zero");
		} else if (units > 0 && units <= 100) {
			amount = units * 1;
		} else if (units > 100 && units <= 300) {
			amount = units * 0.75;
		} else if (units > 300 && units <= 500) {
			amount = units * 0.50;
		} else if (units > 500) {
			amount = units * 0.25;
		}
		System.out.println("Total bill is: $" + amount);
	}

}
