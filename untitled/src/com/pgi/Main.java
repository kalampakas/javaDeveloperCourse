package com.pgi;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String numberAsString="13442.123";
        System.out.println("numberAsString= "+numberAsString);

        double number=Double.parseDouble(numberAsString);
        System.out.println("number="+number);

        numberAsString+=1;
        number+=1;

        System.out.println("new NumberAsString="+numberAsString);
        System.out.println("new number="+number);
    }
}
