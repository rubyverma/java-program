import java.util.Scanner;

public class Program9 {

	/* 9. Write a program to check whether the no. is:-
1. Odd/Even
2. Palindrome
3. Prime
4. Pythagoras Triplet eg. 345(3^2 + 4^2 = 5^2)
5. Print Reverse of the number
*/
	public static void main(String[] args) {

		// check if the number is even or odd
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = input.nextInt();
		if (n % 2 == 0) {
			System.out.println(n + " " + "is even");
		} else {
			System.out.println(n + " " + "is odd");
		}

		// check whether the number is prime or not
		Scanner input2 = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n2 = input2.nextInt();
		int check = 0;
		for (int i = 2; i < n2; i++) {
			if (n2 % i == 0) {
				check = 1;
				break;
			}
		}
		if (check == 0) {
			System.out.println(n2 + " " + "is prime");
		} else {
			System.out.println(n2 + " " + "is composite");
		}

		// check whether a number is Palindrome or not
		Scanner input3 = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n3 = input3.nextInt();
		int temp = n3;
		int reverse = 0;
		while (temp != 0)
		{
			int remainder = temp%10;
			reverse = reverse*10 + remainder;
			temp = temp/10;
		}
		if(n3 == reverse)
		{
			System.out.println(n3 + " " + "is Palindrome");
		}
		else
		{
			System.out.println(n3 + " " + "is not a Palindrome");
		}
		
		// print the reverse of a number
		Scanner input4 = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n4 = input4.nextInt();
		int temp2 = n4;
		int rev = 0;
		while(temp2 != 0)
		{
			int rem = temp2%10;
			rev = rev*10 + rem;
			temp2 = temp2/10;
		}
			System.out.println("Reverse of" + " " + n4 + " " + "is" + " " + rev); 
		
		//find and check whether a number is pythagorean triples
		// Additional comments - Enter upto 3 digit numbers only
		Scanner input5 = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n5 = input5.nextInt();
		int temp3 = n5;
		int rightMostDigit = 0;
		int next_digit = 0;
		int leftMostDigit = 0;
		
			int remain = temp3%10;
			rightMostDigit = (int) Math.pow(remain, 2);
			temp3 = temp3/10;
			int temp4 = temp3%10;
			next_digit = (int) Math.pow(temp4, 2);
			temp4 = temp3/10;
			int temp5 = temp4;
			leftMostDigit = (int) Math.pow(temp5, 2);
		
		System.out.print(leftMostDigit + "+" + next_digit + "=" + rightMostDigit);
		if(leftMostDigit + next_digit == rightMostDigit)
		{
			System.out.println("\n" +  n5 + " " + "is Pythagorus Triplet");
		}
		else
		{
			System.out.println("\n" + n5 + " " + "is not a Pythagorus Triplet");
		}
		}
	

}
