package org.pgi;

public class Car extends Vehicle{
    private int gears;
    private int cc;
    private int currentGear;

    public Car(int gears, int cc) {
        super(0, 0);
        this.gears = gears;
        this.cc = cc;
        this.currentGear=1;
    }

    public Car(){
        this(5,1300);
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }
public void changeGear(int gear){
        if(gear<this.gears && gear>-1)
        this.currentGear=gear;
}
    @Override
    public void setSpeed(int speed){
        changeGear(speed*this.currentGear);
    }
    @Override
    public void setSteering(int steering){
        super.setSteering(steering/180);
    }
}
