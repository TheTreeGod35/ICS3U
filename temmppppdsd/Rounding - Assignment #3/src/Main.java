import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		double spent = 0;
		double total = 0;
		double save = 0;
		final double disc1 = 0.90;
		final double disc2 = 0.80;
		final double disc3 = 0.70;
		final double disc4 = 0.60;
		
		System.out.println("How much money did you spend today? ");
		spent = sc.nextDouble();
		System.out.println("You spent: " + spent);
		
		if (spent <= 40) {
			total = spent * disc1;
			System.out.println("You saved 10%!!");
		}
		
		else if (spent <= 80) {
			total = spent * disc2;
			System.out.println("You saved 20%!!");
		}
		
		else if (spent <= 120) {
			total = spent * disc3;
			System.out.println("You saved 30%!!");
		}
		
		else if (spent > 120) {
			total = spent * disc4;
			System.out.println("You saved 40%!!");
		}

		save = spent - total;
		save = save * 100;
		save = Math.round(save);
		save = save / 100;
		System.out.println("You saved: " + save); 
		
		total = total * 100;
		total = Math.round(total);
		total = total / 100;
		System.out.println("Your total is: " + total);
	}

}
