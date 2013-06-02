import java.util.Scanner;

/* 5. Program to print Floyd�s triangle
1
2 3
4 5 6
7 8 9 10
.....
*/

public class Program5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many rows of Floyd's Triangle?");
		int n = input.nextInt();
		int num = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(num++ + " ");
			}
			System.out.println();
		}
	}

}
