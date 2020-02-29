package org.pgi;

public class Main {

    public static void main(String[] args) {

        areEqualByThreeDecimalPlaces(-3.1756, -3.175);


    }
    public static boolean areEqualByThreeDecimalPlaces ( double x, double y){
        int checkX = (int) (x * 1000);
        int checkY = (int) (y * 1000);
        System.out.println("x , y " + x + " " + y );
        System.out.println("checkx, checky " + checkX + " " + checkY);
        boolean z = (checkX - checkY) == 0;
        System.out.println("returns " + z);
        return z;
    }
}
