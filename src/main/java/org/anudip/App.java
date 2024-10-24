package org.anudip;
import org.anudip.javaapp01.operation.TwoNonDecimalNumbersSum;

public class App {
	public static void main(String[] args) {
		TwoNonDecimalNumbersSum sum = new TwoNonDecimalNumbersSum();
		long result = sum.add(10,0);
		System.out.println(result);
	}
}