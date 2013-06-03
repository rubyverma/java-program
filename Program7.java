import java.util.Scanner;

/* 7. Write a program to print the below output?
1	2	3	4	5
2	4	8	16	32
3	9	27	81	243
4	16	64	256	1024
5	25	125	625	3125
*/

public class Program7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of rows you want to display: ");
		int n = input.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(Math.pow(i, j) + " ");
			}
			System.out.println();
		}
	}

}
