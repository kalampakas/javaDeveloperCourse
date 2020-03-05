package org.pgi;

import java.util.ArrayList;

public class Banks {
    private String bankname;
    private ArrayList<Branch> branches;

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }

    public void setBranches(ArrayList<Branch> branches) {
        this.branches = branches;
    }

    public void addBranch(Branch newBranch) {
        this.branches.add(newBranch);
    }

    public void addCustomer(Branch branch, Customer customer) {
        this.branches.equals(branch).Customers.add(customer);
    }

    public void addTransaction(Branch branch, Customer customer, Transaction transaction) {
        this.branches.equals(branch).equals(customer).addTransaction(transaction);
    }

    public void listBranches() {
        for(int i=0;i<this.branches.size;i++) {
            System.out.println("Branch name:"+ this.branches.item[i].name );
        }
    }

    public Banks(String bankname, ArrayList<Branch> branches) {
        this.bankname = bankname;
        this.branches = branches;
    }
}
