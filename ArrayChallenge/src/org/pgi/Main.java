package org.pgi;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
    int[] unsorted = getIntegers(10);
    int[] sorted = new int[unsorted.length];
    printArray(unsorted);
    sorted=sortArray(unsorted);
    printArray(sorted);
    }

    public static int[] getIntegers(int num){
        int[] inputArray=new int[num];
        Scanner scanner=new Scanner(System.in);
        for(int i=0;i<num;i++) {
            System.out.print("Enter " + num + " integers:");
            try {
                inputArray[i]=scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Bob, wtf, integer!");
                scanner.next();
                i--;
            }
        }
        return inputArray;
    }

    public static int[] sortArray(int[] array) {
        int max=Integer.MIN_VALUE;
        for (int n = 0; n < array.length; n++) {
            max=Integer.MIN_VALUE;
            for (int i = n; i < array.length; i++) {
                int tmp = 0;
                if (max < array[i]) {
                    tmp = max;
                    max = array[i];
                    array[i] = tmp;
                }
                array[n]=max;
            }
        }
        return array;
    }

    public static void printArray(int[] array) {
        for(int i=0;i<array.length;i++) {
            System.out.print(array[i]+"|");
        }
        System.out.println();
    }

}
