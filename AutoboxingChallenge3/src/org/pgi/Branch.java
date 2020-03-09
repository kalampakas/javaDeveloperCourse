package org.pgi;

import java.util.ArrayList;
import java.util.Objects;

import static org.pgi.Main.searching;

public class Branch {
    private ArrayList<Customer> customers;
    private String branchName;

    public Branch(String branchName) {
        this.customers = new ArrayList<>();
        this.branchName = branchName;
    }

    public boolean addTransaction(String customerName, double transaction) {
        Customer customer = findCustomer(customerName);
        if(customer!=null) {
            customer.addTransaction(transaction);
            return true;
        } else {
            System.out.println("No customer like that, transaction failed.");
            return false;
        }
    }

    public String getBranchName() {
        return branchName;
    }

    public boolean newCustomer(String customerName, double transaction) {
        if(findCustomer(customerName)==null){
            System.out.println("Couldn't find "+customerName + "in branch "+ this.getBranchName());
            this.customers.add(new Customer(transaction,customerName));
            System.out.println("Added "+customerName+" to the list of customers for "+this.getBranchName());
            return true;
        }
        else {
            this.customers.add(new Customer(transaction,customerName));
            System.out.println("Customer "+customerName+ "exists!");
            return false;
        }
    }

    private Customer findCustomer(String customerName) {
        for(Customer s: customers) {
            if (s.equals(customerName)) return s;
            else System.out.println("Customer "+customerName+" not found");
        }
        return null;
    }

    public void listCustomers(boolean showTransaction) {
        for(Customer s: customers) {
            System.out.println("Customer:"+s.getName());
            if(showTransaction) {
                s.listTransactions();
            }
        }
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Branch branch = (Branch) o;
        return branchName.equals(branch.branchName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(branchName);
    }
}
