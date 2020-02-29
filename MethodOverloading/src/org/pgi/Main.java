package org.pgi;

public class Main {

    public static void main(String[] args) {
	int newscore = calculateScore("tim", 500);
        System.out.println("New score is " + newscore );
        System.out.println("Overloaded score is " + calculateScore("tim",500,1000));
        System.out.println("Last case, no data :" + calculateScore());

        System.out.println("Height in cm: 6' 12\" =" + calcFeetAndInchesToCentimeters(6,11)+"cm");
        System.out.println("Height in cm: 84\" =" + calcFeetAndInchesToCentimeters(84) + "cm");
    }

    public static int calculateScore (String name, int score) {
        System.out.println("player "+ name + " scored " + score + "points");
        return score * 1000;
    }

    /**
     * @param name - the name of the player
     * @param score - the score for the player
     * @param multiplier - the multiplier used to calculate final score
     * @return will return the total score ( score * multiplier )
     */
    public static int calculateScore (String name, int score, int multiplier) {

        System.out.println("player "+ name + " scored " + score + "points");
        return score * multiplier;
    }

    public static int calculateScore () {
        System.out.println("no player name no player score");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if(feet>=0 && (inches>=0 && inches<12)) {
            return inches*2.54 + feet*12*2.54;
    }
    return -1;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if(inches>=0) {
            return calcFeetAndInchesToCentimeters(inches/12,inches % 12);
        }
        return -1;
    }
}
