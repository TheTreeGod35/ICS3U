package Unit1;

import java.util.Scanner;

public class Menuwithloop {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		
		while (choice != 3) {
			System.out.println("Menu");
			System.out.println("1. Say Hello");
			System.out.println("2. Say Goodbye");
			System.out.println("3. Exit Program");
			System.out.println("Enter Selection: ");
			choice = sc.nextInt();
			
			switch(choice) {
			
			case 1:
				System.out.println("Hello!");
				break;
			case 2: 
				System.out.println("Goodbyee!!");
				break;
			default:
				System.out.println("Exiting Program ...");
			}
		}
	}

}
