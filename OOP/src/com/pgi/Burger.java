package com.pgi;

public class Burger {
    private String breadRoll;
    private String meat;
    private Addition addition1;
    private Addition addition2;
    private Addition addition3;
    private Addition addition4;

    public Addition getAddition1() {
        return addition1;
    }

    public void setAddition1(Addition addition1) {
        this.addition1 = addition1;
    }

    public Addition getAddition2() {
        return addition2;
    }

    public void setAddition2(Addition addition2) {
        this.addition2 = addition2;
    }

    public Addition getAddition3() {
        return addition3;
    }

    public void setAddition3(Addition addition3) {
        this.addition3 = addition3;
    }

    public Addition getAddition4() {
        return addition4;
    }

    public void setAddition4(Addition addition4) {
        this.addition4 = addition4;
    }

    private double basePrice=1.50;
    private static final int MAX_ADDITIONS=4;

    public double getBasePrice() {
        System.out.println("Base price:"+basePrice);
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public Burger(String breadRoll, String meat, double basePrice) {
        this.breadRoll = breadRoll;
        this.meat = meat;
        if(basePrice>0) {
            this.basePrice = basePrice;
        }
    }

    public String getBreadRoll() {
        return breadRoll;
    }

    public void setBreadRoll(String breadRoll) {
        this.breadRoll = breadRoll;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public double additionsPrice(){
        return addition1.getPrice()+addition2.getPrice()+addition3.getPrice()+addition4.getPrice();
    }

    public void printSubTotal(){
        System.out.println("Additions:");
        System.out.println("----------");
        System.out.println(addition1.getName()+" | "+addition1.getPrice());
        System.out.println(addition2.getName()+" | "+addition2.getPrice());
        System.out.println(addition3.getName()+" | "+addition3.getPrice());
        System.out.println(addition4.getName()+" | "+addition4.getPrice());
    }

    public double getPrice(){
        double total=this.basePrice+this.additionsPrice();
        System.out.println("Total:"+total);
        this.printSubTotal();
        System.out.println("-------------");

        return total;
    }
}
