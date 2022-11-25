import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Variable Declarations
		int num1 = 0;
		int num2 = 0;
		int answer = 0;
		Scanner sc = new Scanner(System.in);
		
		//Get user input
		System.out.println("Welcome to Simple Calculator!");
		System.out.println("Enter first number: ");
		num1 = sc.nextInt();
		System.out.println("Enter second number: ");
		num2 = sc.nextInt();
		
		//processing
		answer = num1 + num2;
		
		//output
		System.out.println("Sum: " + answer);
	
		
		
		

	}

}
