package org.anudip.javaapp;

import org.anudip.javaapp.mathematics.Division;

public class App {
    public static void main(String[] args) {
		System.out.println("main() started.");
		
		Division division = new Division();
		//division.divide(10, 0);
		int[] values = {10, 0, 20, 0};
		division.divide(values);
		
		System.out.println("main() ended.");
    }
}