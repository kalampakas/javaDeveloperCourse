package org.pgi;

public class Main {

    public static void main(String[] args) {
	long sum=0;
        for(int i=1,n=0;i<=1000 && n<5;i++){
	    if(i%3==0 && i%5==0) {
	        sum+=i;
	        n++;
        }
    }
        System.out.println("sum:"+sum);
    }
}
