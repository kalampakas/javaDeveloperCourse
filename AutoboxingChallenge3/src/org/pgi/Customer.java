package org.pgi;

import java.util.ArrayList;
import java.util.Objects;

public class Customer {
    private ArrayList<Double> transactions=new ArrayList<>();
    private String name;

    public Customer(Double transaction, String name) {
        addTransaction(transaction);
        this.name = name;
    }

    public void addTransaction(double transaction) {
        this.transactions.add(transaction);
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public String getName() {
        return name;
    }

    public void listTransactions() {
        for(Double cust: transactions) {
            System.out.println("Transaction:"+cust);
        }
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return name.equals(customer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}