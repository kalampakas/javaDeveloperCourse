package com.pgi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int sum=0;
        int counter=1;
        Scanner reader = new Scanner(System.in);
        while(true) {
            System.out.print("Enter number "+counter+" :");
            if (reader.hasNextInt()) {
                sum += reader.nextInt();
                counter++;
                if(counter>10) break;
            } else System.out.println("wtf,number! INVALID NUMBER");
            reader.nextLine();//mui importante
        }
        reader.close();
        System.out.println("");
        System.out.println("sum:"+sum);
    }
}
