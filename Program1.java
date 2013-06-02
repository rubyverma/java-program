import java.util.Scanner;

public class Program1 {
	// 1. Depreciation = (Purchase Price - Salvage Price)/Years of Service
	public static void main(String[] args) {
		Scanner pp = new Scanner(System.in);
		System.out.println("Enter purchase price: ");
		double num = pp.nextDouble();

		Scanner sp = new Scanner(System.in);
		System.out.println("Enter salvage price: ");
		double num2 = sp.nextDouble();

		Scanner year = new Scanner(System.in);
		System.out.println("Enter years of service: ");
		int num3 = year.nextInt();

		double depriciation = ((num - num2) / num3);
		System.out.println("Depriciation is: " + depriciation);
	}

}
