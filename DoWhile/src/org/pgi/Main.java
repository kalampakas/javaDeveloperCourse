package org.pgi;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
	int count = 1;
	while(count<=5) {
        System.out.println("Count value is " + count);
        count++;
    }

	int number=4;
	int finishNumber=20;
	int countnumber=0;
	while(number<=finishNumber) {
	    number++;
	    if(!isEvenNumber(number)) {
	        continue;
        }
	    countnumber++;
        System.out.println("Even number " + number);
    }
        System.out.println("evens are "+countnumber);
    }

    private static boolean isEvenNumber(int a){
        return a%2==0;
    }
}
