package org.anudip;
import org.anudip.javaapp01.operation.Two_Non_Decimal_Number_Sum;

public class App {
	public static void main(String[] args) {
		Two_Non_Decimal_Number_Sum sum = new Two_Non_Decimal_Number_Sum();
		long result = sum.addition(10,0);
		System.out.println(result);
	}
}