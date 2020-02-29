package org.pgi;

import org.w3c.dom.ls.LSInput;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	float myMinFloat= Float.MIN_VALUE;
	float myMaxFloat= Float.MAX_VALUE;
	double myMinDouble= Double.MIN_VALUE;
	double myMaxDouble= Double.MAX_VALUE;
        System.out.println("Min Float\n" + myMinFloat + "\nMax Float\n" + myMaxFloat + "\nMin Double\n" + myMinDouble + "\nMax Double\n" + myMaxDouble);

        int myInt = 5/3;
        float myFloat = 5f /3f;
        double myDouble = 5.00/3.00;
		System.out.println("MyInt = \n"+myInt+"\nMyFloat =\n"+myFloat+"\nMyDouble\n"+myDouble);
		System.out.println("Enter pounds (weight):");
		Scanner input = new Scanner( System.in );
		double pounds = input.nextDouble();
		double kg = pounds * 0.45359237;
		System.out.println( pounds + " pounds are " + kg+ "kg");
		double bigNumbah = 3_000_112_393_911.445_192_912_123;
		System.out.println("numba:" + bigNumbah);

    }
}
