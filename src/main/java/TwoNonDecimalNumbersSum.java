/*
*creating a package
*/
package org.anudip.javaapp.operation;

/*
*creating a class named TwoNonDecimalNumbersSum 
*accessible to every class and methods
*/
public class TwoNonDecimalNumbersSum {

/*
*creating a method with same class name
*accessible to every class and methods
*/

    public long add(int num1, int num2) {
		int result = 0;
		//checking if number is negative and return -1
		if (num1 < 0 || num2 < 0) {
			return -1;
		} 
		//checking if number is 0 and return -2
		else if(num1 == 0 || num2 == 0) {
			return -2;
		} 
		//performs addition if number is neither negative nor 0
		else {
            result = num1 + num2;
        }
        return result;
    }
}	
			
