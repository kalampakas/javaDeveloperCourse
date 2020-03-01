package com.pgi;

public class Main {

    public static void main(String[] args) {
	// write your code here
    Addition tomato=new Addition("tomato",0.20);
    Addition onion=new Addition("onion",0.15);
    Addition lettuce=new Addition("lettuce",0.18);
    Addition pickles=new Addition("pickles",0.12);
    Addition cheese=new Addition("cheese",0.22);
    Addition mayo=new Addition("mayo",0.20);
    Addition ketchup=new Addition("ketchup", 0.11);
    Addition mustard=new Addition("mustard",0.13);
    Addition bacon=new Addition("bacon",0.30);

        Burger bigmac = new DeluxeBurger("rustic","prime beef",bacon,mustard,3.0);
        Burger veggie = new HealthyBurger("veggie",tomato,onion,lettuce,pickles,cheese,mayo,2.50);
        Burger cheeseburger = new Burger("regular","beef",1.80);
        cheeseburger.setAddition1(cheese);
        cheeseburger.setAddition2(pickles);
        cheeseburger.setAddition3(mayo);
        cheeseburger.setAddition4(ketchup);
        Burger doublecheeseburger = new Burger("regular","beef",1.80);
        doublecheeseburger.setAddition1(cheese);
        doublecheeseburger.setAddition2(cheese);
        doublecheeseburger.setAddition3(mayo);
        doublecheeseburger.setAddition4(ketchup);
        System.out.println("Bigmac: "+bigmac.getPrice());
        System.out.println("Veggie: "+veggie.getPrice());
        System.out.println("Cheese: "+cheeseburger.getPrice());
        System.out.println("Double cheese: "+doublecheeseburger.getPrice());

    }
}
