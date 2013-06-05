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
		int check = 0;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				check = 1;
				break;
			}
		}
		if (check == 0) {
			System.out.println(n + " " + "is prime");
		} else {
			System.out.println(n + " " + "is composite");
		}

		// check whether a number is Palindrome or not
		int temp = n;
		int reverse = 0;
		while (temp != 0)
		{
			int remainder = temp%10;
			reverse = reverse*10 + remainder;
			temp = temp/10;
		}
		if(n == reverse)
		{
			System.out.println(n + " " + "is Palindrome");
		}
		else
		{
			System.out.println(n + " " + "is not a Palindrome");
		}
		
		// print the reverse of a number
		int temp2 = n;
		int rev = 0;
		while(temp2 != 0)
		{
			int rem = temp2%10;
			rev = rev*10 + rem;
			temp2 = temp2/10;
		}
			System.out.println("Reverse of" + " " + n + " " + "is" + " " + rev); 
		
		//find and check whether a number is pythagorean triples
		// Additional comments - Enter upto 3 digit numbers only
		int temp3 = n;
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
			System.out.println("\n" +  n + " " + "is Pythagorus Triplet");
		}
		else
		{
			System.out.println("\n" + n + " " + "is not a Pythagorus Triplet");
		}
		}
	

}
