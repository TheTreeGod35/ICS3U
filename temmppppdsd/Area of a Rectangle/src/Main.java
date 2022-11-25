import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//constant variable 
		final double TAX_RATE = 0.13;
		
		//variable declaration
		Scanner sc = new Scanner(System.in);
		int length = 0, width = 0, area = 0;
		
		System.out.println("Enter length: ");
		length = sc.nextInt();
		
		System.out.println("Enter width: ");
		width = sc.nextInt();
		
		area = length * width;
				
		System.out.println("Area is: " + area);
		
		
		

	}

}
