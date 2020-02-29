package org.pgi;

public class Main {

    public static void main(String[] args) {
	// comment
        // another comment
        // and another comment
        // byte
        // short
        // int
        // long
        // double
        // boolean
        // char
        // float
        String myString = "This is a string";
        System.out.println("mystring is equal to" + myString);
        myString = myString + " some more shit και ελληνικα as well as "+ '\u00A9'+" and " + "\n even line breaks!\n";
        System.out.println(myString);
        String numString = "240.44";
        numString=numString + "44.66";
        System.out.println(numString);
        String lastString="10";
        int myInt=50;
        lastString=lastString+myInt;
        System.out.println("LastString is equal to "+lastString);
        double doubleNumber = 340.56d;
        lastString=lastString+doubleNumber;
        System.out.println("last string is now "+ lastString);
    }
}
