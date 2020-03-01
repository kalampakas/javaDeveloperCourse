package com.pgi;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> catalog;

    public MobilePhone(String myNumber) {
        this.myNumber=myNumber;
        this.catalog=new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact){
        if(findContact(contact.getName())>=0 ){
            System.out.println("Contact already on file");
            return false;
        }
        catalog.add(contact);
        System.out.println("Contact added");
        return true;
    }

    public boolean removeContact(Contact contact){
        if(findContact(contact.getName())>=0 ){
            System.out.println("Contact already on file");
            return false;
        }
        catalog.remove(contact);
        System.out.println("Contact deleted");
        return true;
    }
    public void printContacts(){
        System.out.println("Contacts:");
        for(int i=0;i<this.catalog.size();i++){
            System.out.println((i+1)+":"+this.catalog.get(i).getName()+"|"+this.catalog.get(i).getPhonenumber());
        }
    }
    private int findContact(Contact contact){
        return this.catalog.indexOf(contact);
    }

    private int findContact(String name){
        for(int i=0;i<this.catalog.size();i++){
            Contact contact=this.catalog.get(i);
            if(contact.getName().equals(name)){
                return i;
            }
        }
        return -1;
    }

    public boolean updateContact(Contact contact,Contact newContact) {
        int foundPosition = findContact(contact);
        if(foundPosition<0) {
            System.out.println(contact.getName()+" was not found");
            return false;
        } else if(findContact(newContact.getName())!=-1) {
            System.out.println("new contact exists already");
            return false;
        }
        this.catalog.set(foundPosition,newContact);
        System.out.println("Replaced "+ contact.getName() +" with "+newContact.getName());
        return true;
    }

    public String queryContact(Contact query) {
        if(findContact(query)>=0){
            return query.getName();
        }
        return null;
    }

    public Contact queryContact(String name) {
        return this.catalog.get(findContact(name));
    }
}
