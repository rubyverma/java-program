import java.util.Scanner;

public class Program6 {

	/*
	 * 6. Modify the above program to print below output. 
	 	1
		0 1
		0 1 0
		1 0 1 0
		.....
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of rows you want to print: ");
		int n = input.nextInt();
		int num = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(num % 2);
				num++;
			}
			System.out.println();
		}
	}

}
