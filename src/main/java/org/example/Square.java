package org.example;

/**
 * The Square class models a geometric square shape.
 *
 * Demonstrates:
 *  - Encapsulation (private fields with getters/setters)
 *  - Constructor usage
 *  - Basic mathematical computation in a method
 */
public class Square {
    // Private variable - encapsulated property for data hiding
    private double length;

    /**
     * Constructor - initializes the length of the square
     * @param length side length of the square
     */
    public Square(double length) {
        this.length = length;
    }

    /**
     * Calculates the area of the square.
     * Uses the formula: area = length * length
     *
     * @return area of the square
     */
    public double area() {
        double l = getLength(); // demonstrates calling a getter method
        return l * l;
    }

    // Getter method - allows controlled access to private data
    public double getLength() {
        return length;
    }

    // Setter method - allows modification of private data
    public void setLength(double length) {
        this.length = length;
    }
}
