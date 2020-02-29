package org.pgi;

public class VipCustomer {
    private String name;
    private double credit;
    private String email;

    public VipCustomer(String name, double credit, String email) {
        this.name = name;
        this.credit = credit;
        this.email = email;
    }

    public VipCustomer(){
        this("John Doe",1000.0,"john@doe.com");
        System.out.println("Default values during creation used");
    }

    public VipCustomer(String name,double credit) {
        this(name,credit,"john@doe.com");
        System.out.println("E-mail not entered!");
    }

    public String getName() {
        return name;
    }

    public double getCredit() {
        return credit;
    }

    public String getEmail() {
        return email;
    }

    public String output(){
        return getName()+" has "+getCredit()+ " and his e-mail is "+getEmail()+" and object ID is "+this.hashCode();
    }
}
