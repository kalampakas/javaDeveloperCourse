package org.pgi;

import java.util.UUID;

public class BankAccount {
    private UUID number;
    private double balance;
    private String name;

    public BankAccount(UUID number, double balance, String name, String email, String phonenumber) {
        this.number = number;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phonenumber = phonenumber;
    }


    public BankAccount() {
        this(UUID.randomUUID(),10.0,"John Doe","john@example.com","555-5555");
        System.out.println("Empty constructor!");
    }

    public BankAccount(String name, String email, String phonenumber) {
        this(UUID.randomUUID(),10.0,name,email,phonenumber);
    }

    private String email;
    private String phonenumber;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public UUID getNumber(){
        return this.number;
    }

    public void setNumber(UUID id){
        this.number=id;
    }

    public double getBalance(){
        return this.balance;
    }

    public void setBalance(double balance){
        this.balance=balance;
    }

    public void deposit(double deposit){
        this.balance+=deposit;
        System.out.println("Deposited "+deposit+" - Balance is :"+this.balance);
    }

    public int withdraw(double withdraw){
        if(this.balance-withdraw>=0)
        {
            this.balance-=withdraw;

            return 1;
        }
        else {
            System.out.println("Not enough balance.");
            return -1;
        }
    }

}
