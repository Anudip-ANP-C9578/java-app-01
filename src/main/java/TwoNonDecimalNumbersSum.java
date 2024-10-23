package org.anudip.javaapp01.operation;

public class TwoNonDecimalNumbersSum {

        // this methord is to add 2 integer values

    public long add(int num1, int num2) {
        // Check for negative numbers
        int result = 0;

        if ((num1 < 0) || (num2 < 0)) {
            result = -1;
        }

        // Check for zero values
        else if (num1 == 0 || num2 == 0) {
            result = -2;
        }

        // Perform addition and return the result
        else {
        result = num1 + num2;

        }
        return result;        
     }
}