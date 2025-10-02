package org.example;

public class Rectangle {
    private double length;
    private double width;

//    Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

//    Method to calculate area
    public double area(){
       double l = getLength();
       double w = getWidth();
       return l*w;
    }

//    Getters
    public double getLength() {
        return length;
    }
    public double getWidth() {
        return width;
    }

//    Setters
    public void setLength(double length) {
        this.length = length;
    }
    public void setWidth(double width) {
        this.width = width;
    }
}
