package org.example;

/**
 * The Triangle class models a geometric triangle.
 *
 * Demonstrates:
 *  - Use of multiple fields
 *  - Parameterized constructor
 *  - Simple mathematical logic
 */
public class Triangle {
    private double base;
    private double height;

    /**
     * Constructor to initialize the triangle’s dimensions
     */
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    /**
     * Calculates the area of the triangle.
     * Formula: (1/2) * base * height
     */
    public double area(){
        double b = getBase();
        double h = getHeight();
        return 0.5 * b * h;
    }

    // Getters
    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    // Setters
    public void setBase(double base) {
        this.base = base;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
