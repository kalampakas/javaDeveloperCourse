package com.pgi;

import java.util.ArrayList;

public class Mobile {
    private ArrayList<Contacts> catalog = new ArrayList<>();

    public void storeContact(Contacts newContact){
        catalog.add(newContact);
    }

    public void printContacts() {
        for(int i=0;i<catalog.size();i++){
            printContact(catalog.get(i));
        }
    }
    private void printContact(Contacts entry) {
        System.out.println(entry.getName() + "|" + entry.getPhonenumber());
    }
    public void updateContact(String query, Contacts newContact){
        catalog.set(catalog.indexOf(searchContact(query)),newContact);
    }

    public void removeContact(String query){
        int count=0;
        while(catalog.remove(searchContact(query)) && count<catalog.size()){
            count++;
        }
        System.out.println("Removed "+count+" contacts.");
    }
    public Contacts searchContact(String query){
        int i=0;
        Contacts target;
        do {
            target=catalog.get(i);
            if(query.equals(target.getName())||query.equals(target.getPhonenumber())) {
                printContact(target);
                break;
            }
            i++;
        }while(i<catalog.size()-1);
            return findContact(target);
    }

    private Contacts findContact(Contacts contact){
        return catalog.get(catalog.indexOf(contact));
    }

}
