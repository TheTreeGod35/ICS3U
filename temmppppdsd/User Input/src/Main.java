import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//Variable declarations
		String name = "";
		int age = 0;
		double money = 0;
		Scanner sc = new Scanner (System.in);
		// TODO Auto-generated method stub
		// to take user input
		
		System.out.println("Enter Name: ");
		name = sc.nextLine();
		
		// get user age
		System.out.println("Enter your age: ");
		age = sc.nextInt();
		
		// get user money 
		System.out.println("How much money do you have: ");
		money = sc.nextDouble();
		
		System.out.println("Your name is: " + name);
		System.out.println("Your age is: " + age);
		System.out.println("You are worth: " + money);
		

	}

}
