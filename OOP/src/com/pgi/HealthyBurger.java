package com.pgi;

import java.sql.SQLOutput;

public class HealthyBurger extends Burger {
    private Addition addition5;
    private Addition addition6;

    public Addition getAddition5() {
        return addition5;
    }

    public void setAddition5(Addition addition5) {
        this.addition5 = addition5;
    }

    public Addition getAddition6() {
        return addition6;
    }

    public void setAddition6(Addition addition6) {
        this.addition6 = addition6;
    }

    private static final int MAX_ADDITIONS=6;

    public HealthyBurger(String meat, Addition addition1, Addition addition2,Addition addition3, Addition addition4, Addition addition5, Addition addition6, double basePrice) {
        super("Brown Rye", meat,basePrice);
        this.setAddition1(addition1);
        this.setAddition2(addition2);
        this.setAddition3(addition3);
        this.setAddition4(addition4);
        this.addition5=addition5;
        this.addition6=addition6;
    }


    @Override
    public double additionsPrice(){
        return super.additionsPrice()+this.addition5.getPrice()+this.addition6.getPrice();
    }
    public void printSubTotal(){
        super.printSubTotal();
        System.out.println(getAddition5().getName()+" | "+getAddition5().getPrice());
        System.out.println(getAddition6().getName()+" | "+getAddition6().getPrice());
    }
}
