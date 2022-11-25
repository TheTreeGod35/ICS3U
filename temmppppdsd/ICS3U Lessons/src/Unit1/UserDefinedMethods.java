package Unit1;

public class UserDefinedMethods {

	public static void helloworld() { 
		
		System.out.println("Hello Boobus");
		System.out.println("Bogus Obus");
	}
	
	public static int tripleNum (int n) {
		
		int answer;
		answer = n *3;
		return answer;
	}
	public static double addTwoNums(double n1, int n2) {
		
		return(n1 + n2);
	}
	public static void main(String[] args) {
		
		//System.out.println(addTwoNums(3, 13.3));
	}

}
