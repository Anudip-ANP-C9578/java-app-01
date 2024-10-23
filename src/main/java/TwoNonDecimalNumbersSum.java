/*
*creating a package
*/
package org.anudip.javaapp.operation;

/*
*creating a class named TwoNonDecimalNumbersSum 
*accessible to any class
*/
public class TwoNonDecimalNumbersSum {

/*
*creating a method named add and this method contains
*two parameters of int type and returns long type 
*/

    public long add(int num1, int num2) {
		int result = 0;
		/*checking if number is negative and 
		*if negative return -1
		*/
		if (num1 < 0 || num2 < 0) {
			return -1;
		} 
		/*checking if number is 0 and 
		*if 0 return -2
		*/
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
			