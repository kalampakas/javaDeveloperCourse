package org.pgi;

public class Main {

    public static void main(String[] args) {
	int points= calculateScore(true, 800,5,100 );
        System.out.println("points total returned is "+points);
	points =calculateScore( true,10000,8,200);
        System.out.println("points total returned is " + points);

        displayHighScorePosition("alex",calculateHighScorePosition(1500));
        displayHighScorePosition("bob",calculateHighScorePosition(900));
        displayHighScorePosition("carl",calculateHighScorePosition(400));
        displayHighScorePosition("delilah",calculateHighScorePosition(50));
    }
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if(gameOver)    {
            int finalScore=score+(levelCompleted*bonus);
            finalScore+=2000;
            return finalScore;
        }
        return -1;
    }

    public static void displayHighScorePosition(String name, int pos) {
        System.out.println(name + " managed to get into position " + pos + " on the high score table.");

    }

    public static int calculateHighScorePosition(int score) {
//        if(score>=1000) {
//            return 1;
//        } else if(score>=500) {
//            return 2;
//        } else if(score>=100) {
//            return 3;
//        }
//        return 4;
        int position = 4;
        if(score>=1000) {
            position = 1;
        } else if (score>=500) {
            position = 2;
        } else if (score>=100) {
            position = 3;
        }
        return position;
    }
}
