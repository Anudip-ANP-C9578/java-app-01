package org.anudip.javaapp01.operation;

/*
* This class performs the task of addition
* of two non-decimal numbers.
*/
public class TwoNonDecimalNumbersSum {
	/*
	* This method performs the task of addition
	* of two non-decimal numbers.
	*/
	public long add(int num1, int num2) {
		int result = 0;
		
		if((num1 < 0) || (num2 < 0)) {
			result = -1;
		} else if((num1 == 0) || (num2 ==0)) {
			result = -2;
		} else {
			result = num1 + num2;
		}
		
		return result;
	}
}