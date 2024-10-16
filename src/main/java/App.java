/*
*creating a package
*/package org.anudip.javaapp;

/* 
*importing package and class
*/import org.anudip.javaapp.operation.TwoNonDecimalNumbersSum;

/*
*creating main class
*/
public class App {
    public static void main(String[] args) {
	  
	   /*
       *creating object
       */	 
	   TwoNonDecimalNumbersSum twoNonDecimalNumbersSum = new TwoNonDecimalNumbersSum();
	   
	   
	   long result1 = twoNonDecimalNumbersSum.add(7, 5);
	   System.out.println(result1);
	   long result2 = twoNonDecimalNumbersSum.add(-7, 5);
	   System.out.println(result2);
	   long result3 = twoNonDecimalNumbersSum.add(7, -5);
	   System.out.println(result3);
	   long result4 = twoNonDecimalNumbersSum.add(-7, -5);
	   System.out.println(result4);
	   long result5 = twoNonDecimalNumbersSum.add(7, 0);
	   System.out.println(result5);
	   long result6 = twoNonDecimalNumbersSum.add(0, 5);
	   System.out.println(result6);
	   long result7 = twoNonDecimalNumbersSum.add(0, 0);
	   System.out.println(result7);
    }
}