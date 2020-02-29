package org.pgi;

public class Main {

    private static final String[] DAYS={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};

    public static void main(String[] args) {
printDayOfTheWeek(0);
printDayOfTheWeek(4);
printDayOfTheWeek(12);
printDayOfTheWeek(-1);
printDayOfTheWeek(1,true);
printDayOfTheWeek(5,false);
printDayOfTheWeek(11,true);
printDayOfTheWeek(-3,true);
    }
    private static void printDayOfTheWeek(int day) {
        switch (day) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println(DAYS[day]);
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }
        private static void printDayOfTheWeek(int day,boolean noswitch){
            if(noswitch) {
                if(day>=0 && day<=6) {
                    System.out.println(DAYS[day]);
                } else System.out.println("Invalid day");
                } else printDayOfTheWeek(day);
            }
        }


