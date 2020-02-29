package org.pgi;

import java.util.UUID;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BankAccount myAccount=new BankAccount(UUID.randomUUID(),100, "Vasileios Kalampakas","stoneforger@gmail.com","+420776524009");
        System.out.println("Account Number:"+myAccount.getNumber());
        System.out.println("Balance:"+myAccount.getBalance());
        System.out.println("Deposit random long:");
        myAccount.deposit((double)Math.random());
        System.out.println("Balance check:"+myAccount.getBalance());
        System.out.println("Withdraw random long:");
        myAccount.withdraw((double)Math.random()*100);
        System.out.println("Balance check:"+myAccount.getBalance());
        BankAccount anotherAccount=new BankAccount();
        System.out.println("Account Number:"+anotherAccount.getNumber());
        System.out.println("Balance:"+anotherAccount.getBalance());
        System.out.println("Deposit random long:");
        anotherAccount.deposit((double)Math.random());
        System.out.println("Balance check:"+anotherAccount.getBalance());
        System.out.println("Withdraw random long:");
        anotherAccount.withdraw((double)Math.random()*100);
        System.out.println("Balance check:"+anotherAccount.getBalance());

        VipCustomer john=new VipCustomer("John",10000,"john@silver.com");
        VipCustomer frank=new VipCustomer("Frank",100);
        VipCustomer paul=new VipCustomer();
        System.out.println("VipCustomer Data:"+frank.output());
        System.out.println("VipCustomer Data:"+john.output());
        System.out.println("VipCustomer Data:"+paul.output());
    }
}
