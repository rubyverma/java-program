import java.util.Scanner;
public class Program7 {

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of rows you want to display: ");
		int n = input.nextInt();
		for(int i = 1;i <= n;i++)
		{
			for(int j = 1;j <= n;j++)
			{
				System.out.print(Math.pow(i,j) + " ");
			}
			System.out.println();
		}
	}

}
