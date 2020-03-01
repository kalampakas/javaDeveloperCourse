package com.pgi;

public class Contact {
    private String name;
    private String phonenumber;

    public Contact(String name, String phonenumber) {
        this.name = name;
        this.phonenumber = phonenumber;
    }

    public String getName() {
        return name;
    }

    public static Contact createContact(String name, String phonenumber) {
        return new Contact(name,phonenumber);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
}
