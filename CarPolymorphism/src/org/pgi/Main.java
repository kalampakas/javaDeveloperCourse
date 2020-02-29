package org.pgi;

class Car {
private String name;
    private boolean engine;
private int cylinders;
private int wheels;

public Car(String name, int cylinders){
    this.name=name;
    this.cylinders=cylinders;
    this.wheels=4;
    this.engine=true;
}

    public String getName() {
        return name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public boolean isHybrid(){
    return false;
    }

    public void startEngine(){
    this.engine=true;
        System.out.println("Starting engine");
    }

    public void accelerate(){
        System.out.println("Accelerating");
    }
    public void brake(){
        System.out.println("Braking");
    }
}

class Toyota extends Car{
    private boolean hybrid;

    public Toyota(String name, int cylinders) {
        super(name, cylinders);
        this.hybrid=true;
    }

    public void startEngine(){
        System.out.println("Starting hybrid engine");
    }

    public boolean isHybrid(){
        return hybrid;
    }
}

class Lancia extends Car{

    public Lancia(String name, int cylinders) {
        super(name, cylinders);
    }

    public void accelerate(){
        System.out.println("OMFG Stratos acceleration!");
    }

}

class McLaren extends Car{

    public McLaren(String name, int cylinders) {
        super(name, cylinders);
    }

    public void brake(){
        System.out.println("Regenerative brakes enabled!");
    }
}



public class Main {

    public static void main(String[] args) {
	// write your code here
        Car Prius = new Toyota("Prius",16);
        Car F1 = new McLaren("F1",8);
        Car Stratos = new Lancia("Stratos",4);

        System.out.println("Name:"+Prius.getName()+" Cylinders:"+Prius.getCylinders()+ " Hybrid:"+Prius.isHybrid());
        Prius.startEngine();
        Prius.accelerate();
        Prius.brake();

        System.out.println("Name:"+F1.getName()+" Cylinders:"+F1.getCylinders()+ " Hybrid:"+F1.isHybrid());
        F1.startEngine();
        F1.accelerate();
        F1.brake();

        System.out.println("Name:"+Stratos.getName()+" Cylinders:"+Stratos.getCylinders()+" Hybrid:"+Stratos.isHybrid());
        Stratos.startEngine();
        Stratos.accelerate();
        Stratos.brake();
    }

}
