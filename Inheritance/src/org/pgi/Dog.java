package org.pgi;

public class Dog extends Animal{

    private int legs;
    private int tail;
    private int eyes;
    private int teeth;
    private String coat;

    public Dog(int brain, int body, int size, int weight, String name, String race,int legs, int tail, int eyes, int teeth, String coat) {
        super(1, 1, size, weight, name);
        this.legs=legs;
        this.tail=tail;
        this.eyes=eyes;
        this.teeth=teeth;
        this.coat=coat;
    }

    private void chew() {
        System.out.println("Dog.chew called");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }

    public void walk(){
        System.out.println("Dog.walk() called");
        super.move(5);
    }

    public void run(){
        System.out.println("Dog.run() called");
        super.move(10);
    }
private void moveLegs(int speed){
    System.out.println("Dog.moveLegs() called");
}
    @Override
    public void move(int speed) {
        System.out.println("dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }
}
