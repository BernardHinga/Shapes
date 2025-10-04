package org.example;

/**
 * The Rectangle class models a geometric rectangle shape.
 *
 * Demonstrates:
 *  - Encapsulation
 *  - Multiple instance variables
 *  - Constructor overloading with parameters
 *  - Method-based computation
 */
public class Rectangle {
    private double length;
    private double width;

    /**
     * Constructor initializes the rectangle's dimensions.
     * @param length rectangle length
     * @param width rectangle width
     */
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    /**
     * Calculates the area of the rectangle.
     * Formula: area = length * width
     */
    public double area(){
        double l = getLength();
        double w = getWidth();
        return l * w;
    }

    // Getters and setters demonstrating encapsulation
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
