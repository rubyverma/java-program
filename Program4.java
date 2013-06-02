import java.util.Scanner;

public class Program4 {
	/*
	 * 4.Program to find area and circumference of square, rectangle, triangle
	 * or circle based on user selection?
	 */

	public static void main(String[] args) {

		Scanner choice = new Scanner(System.in);
		System.out
				.println("Enter your choice: \n1 for Square \n2 for Rectangle \n3 for Triangle \n4 for Circle");
		int select = choice.nextInt();

		// area and perimeter of square
		if (select == 1) {
			Scanner square = new Scanner(System.in);
			System.out.println("Enter the length of side of square: ");
			double side = square.nextDouble();
			double area_sq = side * side;
			double perimeter_sq = 4 * side;
			System.out.println("The area of square is: " + area_sq);
			System.out.println("The perimeter of square is: " + perimeter_sq);
		}

		// area and perimeter of rectangle
		if (select == 2) {
			Scanner rectangle_length = new Scanner(System.in);
			Scanner rectangle_width = new Scanner(System.in);
			System.out.println("Enter length of rectangle: ");
			double length = rectangle_length.nextDouble();
			System.out.println("Enter width of rectangle: ");
			double width = rectangle_width.nextDouble();
			double area_re = length * width;
			double perimeter_re = (2 * (length + width));
			System.out.println("The area of rectangle is: " + area_re);
			System.out
					.println("The perimeter of rectangle is: " + perimeter_re);
		}

		// area of triangle
		if (select == 3) {
			Scanner triangle_base = new Scanner(System.in);
			Scanner triangle_height = new Scanner(System.in);
			System.out.println("Enter the length of base of triangle: ");
			double base = triangle_base.nextDouble();
			System.out.println("Enter the height of triangle: ");
			double height = triangle_height.nextDouble();
			double area_tr = ((base * height) / 2);
			System.out.println("Area of triangle is: " + area_tr);
		}

		// area and circumference of circle
		if (select == 4) {
			Scanner circle_radius = new Scanner(System.in);
			System.out.println("Enter the radius of circle: ");
			double radius = circle_radius.nextDouble();
			double area_ci = (3.14 * radius * radius);
			System.out.println("Area of circle is: " + area_ci);
			double circumference_ci = (2 * 3.14 * radius);
			System.out.println("Circumference of circle is: "
					+ circumference_ci);
		}
	}

}
