package org.pgi;

import java.util.ArrayList;
import java.util.Objects;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, ArrayList<Double> transactions) {
        this.name = name;
        this.transactions = transactions;
    }

    public Customer addTransaction(double transaction){
        this.transactions.add(transaction);
        return this;
    }

    public void listTransactions() {
        while(this.transactions.listIterator().hasNext() && this.transactions.listIterator().nextIndex()<this.transactions.size()) {
            System.out.println("Transaction: "+this.transactions.listIterator().next().doubleValue());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return getName().equals(customer.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<Double> transactions) {
        this.transactions = transactions;
    }


}

