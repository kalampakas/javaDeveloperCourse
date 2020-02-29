package org.pgi;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("How many integers?");
        Scanner scan = new Scanner(System.in);
        while(true) {
            try {
                System.out.println("Min is :"+findMin(readIntegers(scan.nextInt())));
                break;
            } catch (Exception e) {
                System.out.println("An integer, you clunge");
                scan.next();
            }
        }
        scan.close();
    }

    public static int[] readIntegers(int count) {
        int[] buffer=new int[count];
        Scanner scan = new Scanner(System.in);
        for(int i=0;i<count;i++) {
            System.out.println("Enter "+ (count-i) +" more integer(s)");
            try {
                buffer[i]=scan.nextInt();
            } catch ( InputMismatchException e) {
                System.out.println("Enter an integer you right minge");
                scan.next();
                i--;
            }
        }
        scan.close();
        return buffer;
    }

    public static int findMin(int[] array) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<array.length;i++){
            min=(min>array[i])?array[i]:min;
        }
        return min;
    }
}
