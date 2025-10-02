package org.example;

public class Square {
    private double length;

//    constructor
    public Square(double length) {
        this.length = length;
    }

//    Method to calculate area
    public double area() {
        double l = getLength();
        return l * l;
    }

//    getter
    public double getLength() {
        return length;
    }

//    setter
    public void setLength(double length) {
        this.length = length;
    }

}
