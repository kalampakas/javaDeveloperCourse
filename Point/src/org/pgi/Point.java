package org.pgi;

public class Point {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(){
        this(0,0);
    }

    public double distance() {
        Point zero = new Point();
        return Math.sqrt(Math.pow(this.getX()-zero.getX(),2)+Math.pow(this.getY()-zero.getY(),2));
    }

    public double distance(int x, int y) {
        Point xy = new Point(x,y);
        return Math.sqrt(Math.pow(this.getX()-xy.getX(),2)+Math.pow(this.getY()-xy.getY(),2));
    }

    public double distance(Point point) {
        return Math.sqrt(Math.pow(this.getX()-point.getX(),2)+Math.pow(this.getY()-point.getY(),2));
    }
}
