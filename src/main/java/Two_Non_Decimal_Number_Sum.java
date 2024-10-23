package org.anudip.javaapp01.operation;


public class Two_Non_Decimal_Number_Sum {
	public long addition(long num1,long num2) {
		long result = 0;

		if((num1 < 0) || (num2 < 0)) {
     			result = -1;
                } else if((num1 == 0) || (num2 == 0)) {
     			result = -2;
                } else {
                        result = num1 + num2;
               }
           
           return result;
                  
  }
}