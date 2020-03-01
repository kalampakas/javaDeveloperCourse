package com.pgi;

import java.util.Scanner;

public class Main {
private static Scanner scanner = new Scanner(System.in);
private static MobilePhone phone = new MobilePhone("1234567890");
    public static void main(String[] args) {
	// write your code here
        boolean quit=false;
        startPhone();
        printActions();
        while(!quit) {
            System.out.println("Choose:");
            int action=scanner.nextInt();
            scanner.nextLine();
            switch(action){
                case 0:
                    System.out.println("shutdown!");
                    quit=true;
                    break;
                case 1:
                    phone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;
                default:
                    break;
            }
        }
    }

    private static void addNewContact(){
        System.out.println("New Contact name:");
        String name = scanner.nextLine();
        System.out.println("New phone number:");
        String phonenumber = scanner.nextLine();
        Contact newContact=Contact.createContact(name,phonenumber); // factory
        if(phone.addNewContact(newContact)){
            System.out.println("New contact added!");
        }
        else {
            System.out.println("Name already on file");
        }
    }

    private static void updateContact(){
        System.out.println("Update which contact?");
        String name=scanner.nextLine();
        Contact existingContact = phone.queryContact(name);
        if(existingContact==null) {
            System.out.println("contact not found");
            return;
        }
        System.out.println("What's the new name?");
        String newname=scanner.nextLine();
        System.out.println("what's the new number?");
        String newphone=scanner.nextLine();
        Contact newContact=Contact.createContact(newname,newphone);
        if(phone.updateContact(existingContact,newContact)) {
            System.out.println("updated contact");
        } else {
            System.out.println("could not update");
        }
    }

    private static void removeContact() {
        System.out.println("Remove which contact?");
        String name=scanner.nextLine();
        Contact existingContact = phone.queryContact(name);
        if(existingContact==null) {
            System.out.println("contact not found");
            return;
        }
        if(phone.removeContact(existingContact)) {
            System.out.println("deleted");
        }else{
            System.out.println("error deleting");
        }
    }

    private static void queryContact() {
        System.out.println("Query which contact?");
        String name=scanner.nextLine();
        Contact existingContact = phone.queryContact(name);
        if(existingContact==null) {
            System.out.println("contact not found");
            return;
        }
        System.out.println("name,phone"+existingContact.getName()+","+existingContact.getPhonenumber());
    }

    private static void startPhone() {
        System.out.println("Starting phone...");
    }
    private static void printActions(){
        System.out.println("Available actions:");
        System.out.println("0-shutdown\n"+"1-print contacts\n"+"2-add contact\n"+"3-update contact\n"+"4-remove contact\n"+"5-query contact\n"+"6-print actions\n");
        System.out.println("choose: ");
    }

}
