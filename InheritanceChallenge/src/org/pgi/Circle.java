package org.pgi;

public class Circle {
    private double radius;

    public Circle(double radius) {
        if(radius<0) this.radius=0;
        else this.radius = radius;
    }

    public Circle(){
        this(0);
    }

    public double getRadius(){
        return this.radius;
    }

    public double getArea(){
        return this.radius*this.radius*Math.PI;
    }


}
