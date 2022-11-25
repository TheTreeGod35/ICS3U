import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		double radius = 0;
		double area = 0;
		final double pi = 3.14;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the Radius: ");
		radius = sc.nextDouble();
		
		area = pi * radius * radius;
		
		System.out.println("The area is: " + area);

	}

}
