package com.pgi;

public class DeluxeBurger extends Burger {
    private static final int MAX_ADDITIONS=4;

    public DeluxeBurger(String breadRoll, String meat, Addition addition3,Addition addition4, double basePrice) {
        super(breadRoll,meat,basePrice);
        this.setAddition3(addition3);
        this.setAddition4(addition4);
        this.setAddition1(new Addition("chips",0.30));
        this.setAddition2(new Addition("drink",0.25));
    }

}
