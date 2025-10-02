package org.example;

public class Triangle {
    private double base;
    private double height;

//    Constructor
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

//    Method to calculate area
    public double area(){
        double b = getBase();
        double h = getHeight();
        return 0.5*b*h;
    }

//    Getters
    public double getBase() {
        return base;
    }
    public double getHeight() {
        return height;
    }

//    Setters
    public void setBase(double base) {
        this.base = base;
    }
    public void setHeight(double height) {
        this.height = height;
    }
}
