package com.pgi;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public void printGroceryList() {
        System.out.println("you have "+ groceryList.size() + " items");
        for (String s : groceryList) {
            System.out.print(s + ",");
        }
        System.out.println();
    }

    public void modifyGroceryItem(int position, String newItem) {
        if(position>=0 && position<groceryList.size()) {
            groceryList.set(position, newItem);
            System.out.println("Grocery item at " + (position+1) + " modified.");
        } else System.out.println("that's bigger than the list");
    }

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void removeGroceryItem(int position) {
        String item = groceryList.get(position);
        groceryList.remove(position);
    }

    public String findGroceryItem(String item) {
        int pos = groceryList.indexOf(item);
        if(pos>=0) {
            return groceryList.get(pos);
        }
        return null;
    }

    public int groceryIndex(String item) {
        return groceryList.lastIndexOf(item);
    }
}
