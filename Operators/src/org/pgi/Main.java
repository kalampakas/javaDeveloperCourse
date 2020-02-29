package org.pgi;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {

        int result = 1+2; // 1+2 = 3
        System.out.println("result of 1+2 =" + result);
        int previousResult = result;
        System.out.println("previousResult is" + previousResult);
        result = result -1;
        System.out.println("3 - 1 = " + result);
        System.out.println("previousResult is" + previousResult);

        result = result * 10;
        System.out.println("result"+result);

        result = result / 5; // 20 / 5 = 4
        System.out.println("result now " + result);

        result = result % 3; // remainder of ( 4 / 3 ) = 1
        System.out.println("result mod now"+result);

        result++; // result = result +1 , so 1+1 =2
        System.out.println("result is now ++" + result);
        result--; // result = result - 1 , so 2-1 =1
        System.out.println("result is now result -1 "+result);

        result+=2; // result = result+2 , 1+2 = 3
        System.out.println("result +="+result);

        result*=10;
        System.out.println("result by 10 "+result);

        result/=2;
        System.out.println("result div by 2="+result);
        result-=5;
        System.out.println("result minus 5 = "+result);

        boolean isAlien=false;
        if (isAlien==false) {
            System.out.println("it's not an alien");
            System.out.println("I'm scared of aliens");
        }

        int topScore = 80;
        if ( topScore < 100 ) {
            System.out.println("you got a high score");
        }

        int secondTopScore = 81;
        if ( (topScore > secondTopScore) && (topScore < 100) ) {
            System.out.println("greather than second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <=90)) {
            System.out.println("either or both of the conditions are true");
        }

        int newValue=50;
        if (newValue==50) {
            System.out.println("this is true ");
        }

        boolean isCar = false;
        if (!isCar) {
            System.out.println("car is "+ isCar);
        }
        isCar = true;
        boolean wasCar = isCar ? true : false;

        System.out.println("wasCar is "+wasCar);

        double testVar = 20.00d;
        double anotherVar = 80.00d;
        double totalVar = ((testVar + anotherVar) * 100.00d ) % 40.00d;
        boolean isZero = totalVar == 0 ? true: false;
        System.out.println("isZero is actually "+isZero);
        if (!isZero) {
            System.out.println("Got some remainder");
        }
    }
}
