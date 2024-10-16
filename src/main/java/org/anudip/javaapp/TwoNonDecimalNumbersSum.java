//File name is TwoNonDecimalNumbersSum.java

//creating Package name as  org.anudip.javaapp.operation


package org.anudip.javaapp.operation;

/*
*creating a class with the name of TwoNonDecimalNumbersSum
*/
public class TwoNonDecimalNumbersSum {

    /*
	*creating a public method to perform addition of the following 
    */
	public long add(int num1, int num2) {
		long result;
        // Check for if either number is negative
        if (num1 < 0 || num2 < 0) {
            result = -1; // Return -1 for negative numbers
        }
        
        // Check if either number is zero
        else if (num1 == 0 || num2 == 0) {
            result = -2; // Return -2 for zero input
        }
		else{
			result = num1 + num2;
		}

        // Perform the addition and return result
        return result;// Use long to handle sums exceeding the int range
    }
}