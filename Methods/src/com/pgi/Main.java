package com.pgi;

public class Main {

	public static void main(String[] args) {
		System.out.println(getDigitCount(0));
		System.out.println(getDigitCount( 1));
		System.out.println(getDigitCount(11));
		System.out.println(getDigitCount(241));
		System.out.println(reverse(231));
		System.out.println(reverse(99));
		System.out.println(reverse(1212));
		System.out.println(reverse(111));
		System.out.println(reverse(69));

	numberToWords(10);
	numberToWords(0);
	numberToWords(213);
	numberToWords(123456789);
	numberToWords(-1);
	}

	public static void calculateScore() {

			boolean gameOver = true;
			int score = 800;
			int levelCompleted = 5;
			int bonus = 100;
			if (gameOver) {
				int finalScore = score + (levelCompleted * bonus);
				finalScore += 1000;
				System.out.println("Your final score was " + finalScore);

			}
		}

	public static boolean hasSharedDigit ( int a, int b) {
		if(a<10 || b<10 || a>99 || b>99) {
			return false;
		}else {
			int digitA=a%10;
			int digitB=b%10;
			int digita=(a/10)%10;
			int digitb=(b/10)%10;
			System.out.println(digitA+" "+digitB+" "+digita+" "+digitb);
			return (digitA==digita || digitA==digitb || digitB==digitA || digitB==digitb || digitB==digita);
		}
	}

	public static boolean hasSameLastDigit(int a, int b, int c) {
		if(10<=a && 1000>=a && 10<=b && 1000>=b && 10<=c && 1000>=c) {
			return (a % 10 == b % 10 || b % 10 == c % 10 || c % 10 == a % 10);
		} else return false;

	}

	public static void printFactors(int number) {
		if(number<1) {
			System.out.println("Invalid Value");
		} else {
			int factor=1;
			while(factor<=number){
				if(number%factor==0){
					System.out.print(factor+" ");
				}
				factor++;
			}
		}
	}

	public static boolean isPerfectNumber (int number) {
		if(number>=1) {
			int dividor=1;
			int sum=0;
			while(sum<=number) {
				if(number%dividor==0) {
					sum=sum+dividor;
				}
				System.out.println("sum"+sum+" number "+ number+" dividor "+dividor);
				dividor++;
			}
			return (sum==number);
		}
		return false;
	}

	public static final String[] NUMBERS={"Zero ","One ","Two ","Three ","Four ","Five ","Six ","Seven ","Eight ","Nine "};
	public static void numberToWords(int number) {
		int counter=0;
		if(number>=0){
			int digits=getDigitCount(number);
			int printablenum=reverse(number);
			while(counter<digits) {
				System.out.print(NUMBERS[printablenum%10]);
				printablenum/=10;
				counter++;
			}
		} else System.out.println("Invalid Value");
	}
	public static int reverse(int number){
		int digit=0;
		int newNumber=0;
		while(number!=0){
			digit=number%10;
			newNumber=newNumber*10+digit;
			number/=10;
		}
		return newNumber;
	}
	public static int getDigitCount(int number) {
		if(number>=0){
			int digits=0;
			do {
				number/=10;
				digits++;
			} while(number>0);
			return digits;
		} else return -1;
	}
	}
