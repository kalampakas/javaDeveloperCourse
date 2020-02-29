package org.pgi;

public class Main {

    public static void main(String[] args) {
        System.out.println("1,0,5 =" + canPack(1, 0, 5));
        System.out.println("1,0,4 =" + canPack(1, 0, 4));
        System.out.println("0,5,4 =" + canPack(0, 5, 4));
        System.out.println("2,2,12 =" + canPack(2, 2, 12));
        System.out.println("2,1,5 =" + canPack(2, 1, 5));
        System.out.println("5,3,24 ="+canPack(5,3,24));
        System.out.println("2,10,18 ="+canPack(2,10,18));
        System.out.println("2,10,21 ="+canPack(2,10,21));
        System.out.println("4,18,19 = "+canPack(4,18,19));
        System.out.println("2,7,18 ="+canPack(2,7,18));
        System.out.println("6,2,17 ="+canPack(6,2,17));
    }

    public static boolean canPack(int big, int small, int goal) {
        if (big < 0 || small < 0 || goal < 0) {
            return false;
        } else if (goal == (big * 5 + small) || (big * 5 == goal) || (small >= goal)) {
            return true;
        } else if (big!=0) {
            if (big*5+small>=goal && ((goal/5<big && goal%5==0) || (goal%(big*5)-small<=0) || (goal%5<=small)))
                    {
                return true;
            }
        } else return false;
        return false;
    }
}