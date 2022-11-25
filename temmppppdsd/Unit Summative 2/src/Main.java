import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		
		int numGrades = 6;
		int[] marks = new int[numGrades];
		
		splashScreen(); 
		
		getMarks(marks);
		average = calcAve(marks);
		//acceptOutCome();
		
	}
	
	//DESCRIPTION: Displays program.
	//PARAMETERS: none
	//RETURN TYPE: none
	
	public static void splashScreen() {
		
		System.out.println("Program determines acceptance to University Program...");
		
	}
	
		//DESCRIPTION: Collects marks and stores them in Array
		//PARAMETERS: int[]
		//RETURN TYPE: none
	public static void getMarks(int[] a) { 
		Scanner sc = new Scanner(System.in);
		
		for (int i=0; i<a.length; i++) {
			
			System.out.println("Enter mark " + (i+1) + ":");
			a[i] = sc.nextInt();
			
		}	
	}
		//DESCRIPTION: 
		//PARAMETERS: 
		//RETURN TYPE: 
	public static int calcAve(int[] a) {
		
		int total - 0;
		
		for (int i=0; i<a.length; i++) {
			total = total + a{i};
		}
		
		return (total/a.length);
	}
}
