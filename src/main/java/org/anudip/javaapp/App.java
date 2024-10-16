package org.anudip.javaapp;

import org.anudip.javaapp.operation.TwoNonDecimalNumbersSum;

public class App {
    public static void main(String[] args) {
        TwoNonDecimalNumbersSum twoNonDecimalNumbersSum  = new TwoNonDecimalNumbersSum();
        
        // Test cases
		long result1 = twoNonDecimalNumbersSum.add(10,2);
        System.out.println(result1);   // Output=12
		long result2 = twoNonDecimalNumbersSum.add(10,-2);
        System.out.println(result2); //Output=-1
		long result3 = twoNonDecimalNumbersSum.add(-10,2);
        System.out.println(result3);//Output=-1
        long result4 = twoNonDecimalNumbersSum.add(-10,-2);
        System.out.println(result4);//Output=-1
		long result5 = twoNonDecimalNumbersSum.add(10,0);
        System.out.println(result5);//Output=-2
		long result6 = twoNonDecimalNumbersSum.add(0,2);
        System.out.println(result6);//Output=-2
		long result7 = twoNonDecimalNumbersSum.add(0,0);
        System.out.println(result7);//Output=-2
    } 
}