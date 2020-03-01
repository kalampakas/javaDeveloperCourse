package com.pgi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int max=0;
        int min=0;
        while(true){
            int cur=0;
            System.out.print("Enter number:");
            if(read.hasNextInt()) {
                cur=read.nextInt();
                max=cur>max?cur:max;
                min=(cur<max || cur<min)?cur:min;
            } else break;
        }
        read.nextLine();
        read.close();
        System.out.println("Max="+max+" Min= "+min);
    }
}
