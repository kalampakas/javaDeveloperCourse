package org.pgi;

import me.tongfei.progressbar.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Bank bank = new Bank("P&R Inc.");
        bank.addBranch("Pawnee");
        bank.addCustomer("Pawnee","Pam", 9.44);
        bank.addCustomer("Pawnee","Tim",11.32);
        bank.listCustomers("Pawnee",true);
        bank.addCustomerTransaction("Pawnee","Tim",4.33);
        bank.listCustomers("Pawnee",true);
        bank.addBranch("Idaho");
        bank.listBranches();
        bank.addCustomer("Idaho","Mike",100.00);
        bank.addCustomerTransaction("Pawnee","Joe",12.33);
        bank.listCustomers("Idaho",true);

    }

    public static void searching() {
        System.out.print("\b|");
        System.out.print("\b/");
        System.out.print("\b-");
        System.out.print("\b\\");
    }
}
