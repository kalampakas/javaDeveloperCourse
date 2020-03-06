package org.pgi;

import java.util.ArrayList;
import java.util.Objects;

public class Bank {
    private ArrayList<Branch> branches=new ArrayList<>();
    private String bankName;

    public Bank(String bankName) {
        this.bankName = bankName;
    }

    public boolean addBranch(String branchName){
        if(findBranch(branchName)==null) {
            this.branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double transaction) {
        Branch branch = findBranch(branchName);
        if(branch!=null) {
            return branch.newCustomer(customerName,transaction);
        }
        else {
            System.out.println("Branch doesn't exist");
            return false;
        }
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
        Branch branch = findBranch(branchName);
        if(branch!=null) {
            return branch.addTransaction(customerName, transaction);
        } else {
            System.out.println("Branch doesn't exist");
            return false;
        }
    }

    private Branch findBranch(String branchName) {
        while(this.branches.listIterator().nextIndex()<this.branches.size() && this.branches.listIterator()!=null){
            Main.searching();
            if(this.branches.listIterator().next().getBranchName().equals(branchName)) {
            return this.branches.listIterator().next();
            }
            else this.branches.listIterator().next();
        }
            System.out.println("Could not find "+ branchName +" branch");
            return null;
    }

    public boolean listCustomers(String branchName, boolean showTransactions) {
        Branch branch = findBranch(branchName);
        if(branch!=null){
            System.out.println("Customer for branch:" + branch.getBranchName());
            branch.listCustomers(showTransactions);
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bank bank = (Bank) o;
        return bankName.equals(bank.bankName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bankName);
    }
}
