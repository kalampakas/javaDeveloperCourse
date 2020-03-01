package com.pgi;

import java.util.Scanner;

public class Main {
private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
	// write your code here
        Mobile myMobile= new Mobile();
        boolean quit=false;
        do {
            printOptions();
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice) {
                case 1:
                    myMobile.printContacts();
                    break;
                case 2:
                    myMobile.storeContact(new Contacts(scanner.nextLine(), scanner.nextLine()));
                    break;
                case 3:
                    myMobile.updateContact(scanner.nextLine(),new Contacts(scanner.nextLine(),scanner.nextLine()) );
                    break;
                case 4:
                    myMobile.removeContact(scanner.nextLine());
                    break;
                case 5:
                    myMobile.searchContact(scanner.nextLine());
                    break;
                case 0:
                    quit=true;
                    break;
            }
        } while(!quit);
    }



    private static void printOptions(){
        System.out.println("0-Quit");
        System.out.println("1-Print");
        System.out.println("2-Add");
        System.out.println("3-Update");
        System.out.println("4-Remove");
        System.out.println("5-Find");
    }
}
