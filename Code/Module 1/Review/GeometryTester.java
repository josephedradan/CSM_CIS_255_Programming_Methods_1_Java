import java.util.Scanner;

public class GeometryTester {


	public static void main(String[] args) {
		System.out.println("Enter the radius of a circle:");
		Scanner scan = new Scanner(System.in);
		int radius = scan.nextInt(); // reads in and returns an integer that the user types

		double area = Math.PI * Math.pow(radius,  2);
		double circumference = 2 * Math.PI * radius;
		
		System.out.println("The area is " + area);
		System.out.println("The circumference is " + circumference);
		
		System.out.println("Enter the x1 coordinate: ");
		int x1 = scan.nextInt();
		System.out.println("Enter the y1 coordinate: ");
		int y1 = scan.nextInt();
		System.out.println("Enter the x2 coordinate: ");
		int x2 = scan.nextInt();
		System.out.println("Enter the y2 coordinate: ");
		int y2 = scan.nextInt();
		
		double firstTerm = Math.pow((x2-x1),2);
		double secondTerm = Math.pow((y2-y1),2);
		double distance = Math.sqrt(firstTerm + secondTerm);
		
		System.out.println("The distance between those points is " + distance);

		
	}

}
