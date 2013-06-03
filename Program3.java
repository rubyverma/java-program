import java.util.Scanner;

public class Program3 {
	/*
	 * 3.Electricity bill is calculated based on below conditions find the
	 * actual amount to be paid by the user.Units Cost/Unit 0-100 $1 100-300
	 * $0.75 300-500 $0.50 500> $0.25 Write program to calculate the monthly
	 * bill user needs to pay get units consumed from user?
	 */
//cumulative amount
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of units consumed: ");
		int units = input.nextInt();
		double amount;
		double totalamt;
		if (units < 0) {
			System.out.println("Error! Units cannot be than 0");
		} else if (units > 0 && units <= 100) {
			amount = 1;
			totalamt = amount * units;
			System.out.println("Your monthly bill is: $" + totalamt);
		} else if (units > 100 && units <= 300) {
			amount = 0.75;
			totalamt = 100 * 1 + (amount * (units - 100));
			System.out.println("Your monthly bill is: $" + totalamt);
		} else if (units > 300 && units <= 500) {
			amount = 0.50;
			totalamt = 100 * 1 + 200 * 0.75 + (amount * (units - 300));
			System.out.println("Your monthly bill is: $" + totalamt);
		} else {
			amount = 0.25;
			totalamt = 100 * 1 + 200 * 0.75 + 200 * 0.50
					+ (amount * (units - 500));
			System.out.println("Your monthly bill is: $" + totalamt);
		}
	}

}
