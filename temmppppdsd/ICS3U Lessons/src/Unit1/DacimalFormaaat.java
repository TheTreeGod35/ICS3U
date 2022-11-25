package Unit1;

import java.text.DecimalFormat;


public class DacimalFormaaat {

	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("0.00");
		double num = 12.134;
		num = Double.parseDouble(df.format(num));
		System.out.println(num);

	}

}
