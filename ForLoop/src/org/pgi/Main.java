package org.pgi;

public class Main {

    public static void main(String[] args) {
        for(double i=2.0d;i<11.0d;i+=1.0d) {
            System.out.println("10,000 at "+i+"% interest = " + String.format("%.2f",calculateInterest(10000.0, i)));
        }

        for(double i=8.0d;i>1.0d;i-=1.0d) {
            System.out.println("10,000 at "+i+"% interest = " + String.format("%.2f",calculateInterest(10000.0, i)));
        }

        for(int j=1;j<Long.MAX_VALUE;j++) {
            if (isPrime(j)) {
                System.out.println(j + " is prime");

            }
        }
    }

    public static double calculateInterest(double amount,double rate) {
        return (amount*(rate/100d));
    }

    public static boolean isPrime(long n) {
        if(n==1) {
            return false;
        }

        for(long i=2; i<=n/2; i++) {
            if(n%i ==0) {
                return false;
            }
        }
        return true;
    }
}
