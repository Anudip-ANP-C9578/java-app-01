/*Program to perform addition of two non-decimal numbers*/

package org.anudip.javaapp01.operation;

public class TwoNonDecimalNumbersSum     

/*To performs the task addition of two non-decimal numbers*/

{
	public long add(int a, int b)  
	
	/*This method performs the task of addition of two non-decimal numbers.*/

       {
		 	int ans = 0;
		
	   		if((a < 0) || (b < 0)) 
            {
		 		ans = -1;
	      	} 
           	else if((a == 0) || (b == 0)) 
            {
				ans = -2;
	      	} 
           	else 
            {
				ans = a + b;
	     	}
		
	  		return ans;
      	}
}