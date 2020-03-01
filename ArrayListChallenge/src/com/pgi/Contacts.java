package com.pgi;

public class Contacts {
    private String name;
    private String phonenumber;

    private String validnumbers = "^?\\+/d{10,13}";

    public Contacts(String name, String phonenumber) {
        this.name = name;
        this.phonenumber = phonenumber;
    }

    public Boolean matchContact(String query) {
        return this.getName().equals(query) || this.getPhonenumber().equals(query);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        if(phonenumber.matches(validnumbers)) this.phonenumber = phonenumber;
        else this.phonenumber = "555-CALL-ME";
    }

}

