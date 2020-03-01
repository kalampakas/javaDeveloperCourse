package com.pgi;

import java.awt.event.WindowFocusListener;

public class Main {

    public static void main(String[] args) {
        printSquareStar(6);
    }
    /*public static int getLargestPrime(int number) {
        if(number<2) return -1;
        int count=2;
        while(number>1){
            if(number%count==0){
                number/=count;
            } else count++;
        }
        return count;
    }*/

    public static void printSquareStar ( int a) {
        if (a < 5) System.out.println("Invalid Value");
        else {
            for (int y = 1; y <= a; y++) {
                for (int x = 1; x < a; x++) {
                    if(y==1 || y==x || x==1 || x==a-y+1 || y==a) {
                        System.out.print("*");
                    } else System.out.print(" ");
                } System.out.println("*");
            }
        }
    }
}
