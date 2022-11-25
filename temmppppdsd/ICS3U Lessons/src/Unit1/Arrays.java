package Unit1;

public class Arrays {

	public static void main(String[] args) {

		int[] myArray = new int[3];
		
		myArray[0] = 13;
		myArray[1] = 22;
		myArray[2] = 47;
		
		
		System.out.println(myArray[0]);
		System.out.println(myArray[1]);
		System.out.println(myArray[2]);
		
		double[] myArray2 = {3.3, 4.4, 2.4, 2.1, 3.3, 4.4, 2.4, 2.1, 3.3, 4.4, 2.4, 2.1};
		
		for (int i=0; i<myArray2.length; i++) {
			System.out.println(myArray2[i]);
		}
		
	}

}
