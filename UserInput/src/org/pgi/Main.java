package org.pgi;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int yob = 0;
        /*while(true) {
            try {
                System.out.printf("birth year:");
                yob = scan.nextInt();
                scan.nextLine();
                break;
            } catch (Exception e) {
                System.out.println("what the fuck man ? YEAR");
                scan.next();
            }
        }*/
        System.out.print("Year of Birth:");
        boolean ok = scan.hasNextInt();
        if (ok) {
            yob=scan.nextInt();
            scan.nextLine();
            System.out.print("enter name:");
            String name = scan.nextLine();
            int age = 2020 - yob;
            if (age >= 0 && age <= 200) {
                System.out.println("name is " + name + " and age is " + age + " years old");
            }
        } else System.out.println("WHAT THE FUCK ? YEAR !");
    }
}
