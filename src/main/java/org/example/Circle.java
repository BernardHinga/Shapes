package org.example;

/**
 * The Circle class models a circle shape.
 *
 * Demonstrates:
 *  - Static class variables (pi)
 *  - Constructor usage
 *  - Basic formula computation
 */
public class Circle {
    // Static field shared by all instances of the class
    static double pi = 3.14;

    private double radius;

    /**
     * Constructor to initialize radius
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Calculates the area of the circle.
     * Formula: π * r²
     */
    public double area(){
        double r = getRadius();
        return pi * r * r;
    }

    // Getter and setter for encapsulation
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
