package org.pgi;

public class Main {

    public static void main(String[] args) {
        // write your code here
    }

    public static class NumberOfDaysInMonth {
        public static boolean isLeapYear(int year) {
            if (year >= 1 && year <= 9999) {
                return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
            } else return false;
        }

        public static int getDaysInMonth(int month, int year) {
            if (year < 1 || year > 9999 || month < 1 || month > 12) {
                return -1;
            } else if (month == 2) {
                return isLeapYear(year) ? 29 : 28;
            } else {
                switch (month) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        return 31;
                    break;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        return 30;
                    break;
                }
            }

        }
    }
}
