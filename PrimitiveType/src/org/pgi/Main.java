package org.pgi;

public class Main {

    public static void main(String[] args) {
	byte myByte = 96;
	short myShort = 2048;
	int myInt=131072;
	long myLong=(long)(50000+10*(myByte+myInt+myShort));
        System.out.println("The number is "+ myLong);

		short shortTotal = (short) (1000 + 10 * (myByte + myShort + myInt));
		System.out.println("shortTotal="+shortTotal);
	}
}
