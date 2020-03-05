package org.pgi;

import java.util.ArrayList;
import java.util.Objects;

public class Branch {
    private String branchName;
    private ArrayList<Customer> customers;

    public Branch(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    public void addCustomer(Customer customer){
        this.customers.add(customer);
    }

    public void addTransaction(Customer customer, double transaction) {
        while(!this.customers.listIterator().equals(customer) && this.customers.listIterator().hasNext()) {
            this.customers.listIterator().next();
        }
        this.customers.listIterator().set(customer.addTransaction(transaction));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Branch branch = (Branch) o;
        return getCustomers().equals(branch.getCustomers());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCustomers());
    }
}

