package org.anudip.javaapp.mathematics;

public class Division {
	public int divide(int[] numbers) {
		System.out.println("divide() started.");
		
		int result = 0;
		
		System.out.println("1st value = " + numbers[0]);
		try {
			System.out.println("2nd value = " + numbers[10]);
		} catch (ArrayIndexOutOfBoundsException aioobEx) {
			aioobEx.printStackTrace();
		}
		
		try {
			result = numbers[0] / numbers[1];
		} catch (ArithmeticException aEx) {
			aEx.printStackTrace();
		}
		System.out.println("1st value / 2nd value = " + result);
		
		int result2 = 0;
		System.out.println("3rd value = " + numbers[2]);
		System.out.println("4th value = " + numbers[3]);
		try {
			result2 = numbers[2] / numbers[3];
		} catch(ArithmeticException aEx) {
			aEx.printStackTrace();
		}
		System.out.println("3rd value / 4th value = " + result2);
		
		System.out.println("divide() ended.");
		
		return result;
	}
	
	//public int divide(int num1, int num2) {
		/*int result = 0;
		
		try {
			System.out.println("divide() started.");
			
			System.out.println("1st value = " + num1);
			System.out.println("2nd value = " + num2);
			
			result = num1 / num2;
			System.out.println("1st value / 2nd value = " + result);
			
			int num3 = 20;
			int num4 = 4;
			int result2 = 0;
			result2 = num3 / num4;
			
			System.out.println("3rd value / 4th value = " + result2);
			
			System.out.println("divide() ended.");
		} catch(ArithmeticException aEx) {
		}
		
		return result;*/
		
		/*System.out.println("divide() started.");
		
		int result = 0;
		
		System.out.println("1st value = " + num1);
		System.out.println("2nd value = " + num2);
		
		try {
			result = num1 / num2;
		} catch (ArithmeticException aEx) {
			//System.out.println("Sorry user u r dividing by 0 in 1st division task.");
			aEx.printStackTrace();
		}
		
		System.out.println("1st value / 2nd value = " + result);
		
		int num3 = 20;
		int num4 = 0;
		int result2 = 0;
		try {
			result2 = num3 / num4;
		} catch(ArithmeticException aEx) {
			//System.out.println("Sorry user u r dividing by 0 in 2nd division task.");
			aEx.printStackTrace();
		}
		System.out.println("3rd value / 4th value = " + result2);
		
		System.out.println("divide() ended.");
		
		return result;
	}*/
	
    /*public int divide(int num1, int num2) {
		System.out.println("divide() started.");
		
		int result = 0;
		
		System.out.println("1st value = " + num1);
		System.out.println("2nd value = " + num2);
		
		try {
			result = num1 / num2;
		} catch (ArithmeticException aEx) {
		}
		
		System.out.println("1st value / 2nd value = " + result);
		
		System.out.println("divide() ended.");
		
		return result;
    }*/
}