package org.pgi;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Animal  animal = new Animal(1,1,5,5,"animal");
        Dog dog = new Dog(8,20,2,4,"cocker","cocker",4,3,3,3,"brown");
        //dog.eat();
        dog.walk();
        //dog.run();
        dog.move(3);
        Fish fish = new Fish(1,2,"dick",4,1,1);
        fish.swim(3);
    }
}
