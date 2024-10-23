package org.anudip;

import org.anudip.javaapp01.operation.TwoNonDecimalNumbersSum;

public class App
{
public static void main(String[] args)
{
TwoNonDecimalNumbersSum twonondecimalnumberssum = new TwoNonDecimalNumbersSum();

long result1 = twonondecimalnumberssum.add(10,2);
System.out.println(result1);

long result2 = twonondecimalnumberssum.add(2,10);
System.out.println(result2);

long result3 = twonondecimalnumberssum.add(10,-2);
System.out.println(result3);

long result4 = twonondecimalnumberssum.add(-10,2);
System.out.println(result4);

long result5 = twonondecimalnumberssum.add(-10,-2);
System.out.println(result5);

long result6 = twonondecimalnumberssum.add(10,0);
System.out.println(result6);

long result7 = twonondecimalnumberssum.add(0,2);
System.out.println(result7);

long result8 = twonondecimalnumberssum.add(0,0);
System.out.println(result8);
}
}