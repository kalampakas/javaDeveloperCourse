package org.pgi;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
	int[] intArray=getIntegers(5);
	printArray(intArray);
        System.out.println(getAvg(intArray));
    }
public static int[] getIntegers(int number){
    System.out.println("Enter "+number+" integer values.\r");
    int[] values= new int[number];
    for(int i=0;i<values.length;i++) {
        try{
            values[i] = scanner.nextInt();
        }
        catch ( Exception e) {
            scanner.next();
            System.out.println("whoops!"+e.toString());
            i--;
        }
    }
    return values;
}
    public static void printArray(int[] array){
        for(int i=0;i<array.length;i++) {
            System.out.print(array[i]+" ");
        }
    }

    public static double getAvg(int[] array){
        double sum=0;
        for(int i=0;i<array.length;i++){
            sum+=array[i];
        }
        return sum/array.length;
    }
}
