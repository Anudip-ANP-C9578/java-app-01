package org.anudip;
import org.anudip.javaapp01.operation.TwoNonDecimalNumbersSum;
public class App{
	public static void main(String[] args){
		TwoNonDecimalNumbersSum twoNonDecimalNumbersSum=new TwoNonDecimalNumbersSum();
		long result1=twoNonDecimalNumbersSum.add(10,2);
		System.out.println(result1);
		long result2=twoNonDecimalNumbersSum.add(10,-2);
		System.out.println(result2);
		long result3=twoNonDecimalNumbersSum.add(-10,2);
		System.out.println(result3);
		long result4=twoNonDecimalNumbersSum.add(-10,-2);
		System.out.println(result4);
		long result5=twoNonDecimalNumbersSum.add(10,0);
		System.out.println(result5);
        long result6=twoNonDecimalNumbersSum.add(0,2);
		System.out.println(result6);	
        long result7=twoNonDecimalNumbersSum.add(10,2);
		System.out.println(result7);
        long result8=twoNonDecimalNumbersSum.add(2,10);
		System.out.println(result8);
	}
}
		
	
