package org.pgi;

public class Dimensions {
    private double length;
    private double width;
    private double height;

    public Dimensions(double length, double width, double height) {
        this.length = Math.abs(length);
        this.width = Math.abs(width);
        this.height = Math.abs(height);
    }

    public Dimensions(double length, double width) {
        this.length = Math.abs(length);
        this.width = Math.abs(width);
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}
