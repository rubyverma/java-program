import java.util.Scanner;

public class Program10 {
	/*
	 * 10. Program to find smallest, largest, and mean and mode of given numbers
	 * within an array? Also print reverse of array?
	 */

	public static void main(String[] args) {
		float[] list = new float[5];
		float sum = 0;
		float mean;
		float largest = list[0];
		Scanner input = new Scanner(System.in);
		// asking user input
		System.out.println("Enter the list of numbers: ");

		// storing user input
		for (int i = 0; i < list.length; i++) {
			list[i] = input.nextFloat();
		}

		// finding mean
		for (int i = 0; i < list.length; i++) {
			sum = sum + list[i];
		}
		mean = sum / list.length;
		System.out.println("Mean is: " + mean);

		// find smallest number
		float smallest = list[0];
		for (int i = 0; i < list.length; i++) {
			if (list[i] < smallest) {
				smallest = list[i];
			}
		}
		System.out.println("Smallest number is: " + smallest);

		// find largest number
		for (int i = 0; i < list.length; i++) {
			if (list[i] > largest) {
				largest = list[i];
			}
		}
		System.out.println("Largest number is: " + largest);

		// printing reverse of array
		for (int i = 4; i >= 0; i--) {
			System.out.print(list[i] + " " + " ");
		}
	}
}
