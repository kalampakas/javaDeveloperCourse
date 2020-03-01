package com.pgi;

import javax.management.BadStringOperationException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
private static Scanner scanner = new Scanner(System.in);
private static GroceryList groceryList = new GroceryList();
    public static void main(String[] args) {
	// write your code here
        boolean quit = false;
        int choice=0;
        printInstruction();
        while(!quit) {
            System.out.println("enter choice: ");
            choice=scanner.nextInt();
            scanner.nextLine();
            switch(choice) {
                case 0:
                    printInstruction();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    groceryList.addGroceryItem(scanner.nextLine());
                    break;
                case 3:
                    System.out.print("Item to change?");
                    String oitem=scanner.nextLine();
                    System.out.print("New item ?");
                    scanner.nextLine();
                    String nitem=scanner.nextLine();
                    groceryList.modifyGroceryItem(groceryList.groceryIndex(oitem), nitem);
                    break;
                case 4:
                    groceryList.removeGroceryItem(groceryList.groceryIndex(scanner.nextLine()));
                    break;
                case 5:
                    System.out.println(groceryList.findGroceryItem(scanner.nextLine()));
                    break;
                case 7:
                    quit=true;
                    break;
                case 6:
                    processArrayList();
                    break;

            }
        }
    }

    private static void printInstruction(){
        System.out.println("0 - options");
        System.out.println("1 - print list");
        System.out.println("2 - add item");
        System.out.println("3 - modify item");
        System.out.println("4 - remove item");
        System.out.println("5 - find item");
        System.out.println("6 - quit");
    }

    private static void processArrayList() {
        ArrayList<String> newArray = new ArrayList<String>();
        newArray.addAll(groceryList.getGroceryList());

        ArrayList<String> nextArray = new ArrayList<String>(groceryList.getGroceryList());

        String[] myArray = new String[groceryList.getGroceryList().size()];
        myArray = groceryList.getGroceryList().toArray(myArray);
    }
}
