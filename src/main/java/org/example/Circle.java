package org.example;

public class Circle {
    static double pi = 3.14;

    private double radius;

//    Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

//    Method to calculate area
    public double area(){
        double r = getRadius();
        return pi * r * r;
    }

//    Getter
    public double getRadius() {
        return radius;
    }

//    Setter
    public void setRadius(double radius) {
        this.radius = radius;
    }
}
