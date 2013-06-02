import java.util.Scanner;
public class Program5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many numbers?");
		int n = input.nextInt();
		for(int i=1;i<=n;i++){
		System.out.print(i);
		System.out.println();
		}
	}

}
