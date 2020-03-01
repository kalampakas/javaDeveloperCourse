package com.pgi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner read=new Scanner(System.in);
        int sum=0;
        int count=0;
        while(true){
            if(read.hasNextInt()){
                count++;
                sum+=read.nextInt();
                +" count "+count);
            } else break;
        }
        read.nextLine();
        read.close();
        if(count==0) System.out.println("SUM = 0 AVG = 0");
        else System.out.println("sum "+sum+" avg "+Math.round((double)sum/(double)count));
    }
}
