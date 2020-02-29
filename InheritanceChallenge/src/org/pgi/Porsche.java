package org.pgi;

public class Porsche extends Car {
    private String color;
    private int turbo;

    public Porsche(String color, int turbo) {
        super(6,2000);
        this.color = color;
        this.turbo = turbo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getTurbo() {
        return turbo;
    }

    public void setTurbo(int turbo) {
        this.turbo = turbo;
    }

    @Override
    public void setSpeed(int speed) {
        super.setSpeed(speed+this.turbo);
    }
}
