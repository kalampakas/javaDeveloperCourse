package org.pgi;

public class Vehicle {
    private int speed;
    private int steering;

    public Vehicle(int speed, int steering) {
        this.speed = speed;
        this.steering = steering;
    }

    public Vehicle(){
        this(0,0);
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSteering() {
        return steering;
    }

    public void setSteering(int steering) {
        this.steering = steering;
        System.out.println("Steering at "+ steering + " degrees.");
    }
}
