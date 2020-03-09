package org.pgi;

import me.tongfei.progressbar.ProgressBar;

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
            System.out.println("Adding new branch: "+branchName);
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double transaction) {
        Branch branch = findBranch(branchName);
        if(branch!=null) {
            System.out.println("Adding new customer,"+customerName);
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
            System.out.println("Adding new customer transaction");
            return branch.addTransaction(customerName, transaction);
        } else {
            System.out.println("Branch doesn't exist");
            return false;
        }
    }

    private Branch findBranch(String branchName) {
        try (ProgressBar pb = new ProgressBar("Looking for branch",this.branches.size())) {
            for (Branch b : branches) {
                pb.step();
                if (b.getBranchName().equals(branchName)) {
                    System.out.println("Found branch " + branchName);
                    return b;
                } else System.out.println("Could not find " + branchName);
            }
            return null;
        }
    }

    public void listBranches(){
        for(Branch i: branches) {
            System.out.println("Branch: "+ i.getBranchName());
        }
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
