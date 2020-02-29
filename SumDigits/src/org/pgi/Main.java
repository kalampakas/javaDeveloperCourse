package org.pgi;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumDigits(1000));
        isPalindrome(11);
    }

    private static long sumDigits (int number) {
        int sum=0;
        if(number>=10) {
            while(number>=1){
                sum=number % 10 + sum;
                number/=10;
            }
            return sum;
        } else return -1;
    }

    public static boolean isPalindrome(int number){
        int x=Math.abs(number);
        int reverse = 0;
        int digit = 0;
        while(x>0) {
            digit = x%10;
            reverse = reverse * 10 + digit;
            x/=10;
            System.out.println("Digit "+digit+" reverse "+reverse+" x "+x);
        }
        return (reverse == Math.abs(number));

    }

    public static int sumFirstAndLastDigit (int number) {
        int lastDigit,firstDigit=0;
        if(number<0){
            return -1;
        } else {
            lastDigit=number%10;
            while(number>0){
                firstDigit=number%10;
                number/=10;
            }
            return lastDigit+firstDigit;
        }
    }
}
