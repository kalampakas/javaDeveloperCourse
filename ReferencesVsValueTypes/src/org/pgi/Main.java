package org.pgi;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int myIntValue=10;
        int anotherIntValue=myIntValue;
        System.out.println("my "+myIntValue);
        System.out.println("another" +anotherIntValue);
        anotherIntValue++;
        System.out.println("my "+myIntValue);
        System.out.println("another" +anotherIntValue);

        int[] myIntArray = new int[5];
        int[] anotherIntArray = myIntArray;

        myIntArray[3]=1;
        anotherIntArray[0]=5;

        System.out.println(Arrays.toString(myIntArray));
        System.out.println(Arrays.toString(anotherIntArray));

        anotherIntArray=new int[]{6,7,8,9,10};
        modArray(myIntArray);

        System.out.println(Arrays.toString(myIntArray));
        System.out.println(Arrays.toString(anotherIntArray));
    }

    private static void modArray(int[] array){
        array[0]=2;
        array=new int[]{1,2,3,4,5};
    }
}
