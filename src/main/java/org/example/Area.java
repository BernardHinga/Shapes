package org.example;

import java.util.Scanner;

/**
 * The Area class serves as the main controller of the program.
 *
 * Demonstrates:
 *  - Object composition (uses other classes: Square, Circle, etc.)
 *  - User input handling with Scanner
 *  - Control structures (switch statements)
 *  - Recursion for menu looping
 *
 * This class ties all shape classes together to create
 * a functional area-calculating program.
 */
public class Area {
    // Instantiate shape objects - composition (a class contains other objects)
    Square square = new Square(0);
    Rectangle rectangle = new Rectangle(0, 0);
    Triangle triangle = new Triangle(0, 0);
    Circle circle = new Circle(0);

    // Variables to store user inputs
    public double Area;
    public double length;
    public double width;
    public double height;
    public double base;
    public double radius;

    // Scanner for user input
    Scanner userInput = new Scanner(System.in);

    /**
     * Introduction message displayed to user at the start.
     * Demonstrates basic text output and string formatting.
     */
    public void introduction(){
        System.out.println("========================================\n" +
                "        SHAPE AREA CALCULATOR\n" +
                "========================================\n" +
                "Welcome! This program helps you calculate \n" +
                "the area of different shapes.\n" +
                "\n" +
                "Available Shapes:\n" +
                "  1. Square\n" +
                "  2. Rectangle\n" +
                "  3. Triangle\n" +
                "  4. Circle\n" +
                "\n" +
                "Follow the instructions to enter your \n" +
                "shape and its dimensions, and I’ll compute \n" +
                "the area for you.\n" +
                "\n" +
                "----------------------------------------\n");
    }

    /**
     * Menu system for user input.
     * Demonstrates:
     *  - String comparison
     *  - switch-case control
     *  - User-driven logic
     */
    public void menu() {
        System.out.println("Enter which shape you want to calculate for:\t\t Or type 'exit' to end the program");

        String shape = userInput.nextLine();
        shape = shape.toLowerCase(); // makes input case-insensitive

        // Switch-case logic to determine which shape to calculate
        switch (shape) {
            case "square":
                System.out.println("Enter the length of the square:");
                length = userInput.nextDouble();

                square.setLength(length);
                Area = square.area();

                System.out.println("The area of the square of length " + square.getLength() + " is: " + Area);
                userInput.nextLine(); // clears buffer
                menu(); // recursion to loop the menu
                break;

            case "rectangle":
                System.out.println("Enter the length of the rectangle:");
                length = userInput.nextDouble();
                System.out.println("Enter the width of the rectangle:");
                width = userInput.nextDouble();

                rectangle.setLength(length);
                rectangle.setWidth(width);
                Area = rectangle.area();

                System.out.println("The area of the rectangle of length " + rectangle.getLength() +
                        " and width " + rectangle.getWidth() + " is: " + Area);
                userInput.nextLine();
                menu();
                break;

            case "triangle":
                System.out.println("Enter the base of the triangle:");
                base = userInput.nextDouble();
                System.out.println("Enter the height of the triangle:");
                height = userInput.nextDouble();

                triangle.setBase(base);
                triangle.setHeight(height);
                Area = triangle.area();

                System.out.println("The area of the triangle of base " + triangle.getBase() +
                        " and height " + triangle.getHeight() + " is: " + Area);
                userInput.nextLine();
                menu();
                break;

            case "circle":
                System.out.println("Enter the radius of the circle:");
                radius = userInput.nextDouble();

                circle.setRadius(radius);
                Area = circle.area();

                System.out.println("The area of the circle of radius " + circle.getRadius() + " is: " + Area);
                userInput.nextLine();
                menu();
                break;

            case "exit":
                System.out.println("Thank you for using our program.");
                break;

            default:
                System.out.println("Invalid shape entered. Please try again.");
                menu();
        }
    }

    /**
     * Starts the calculator by showing the intro and launching the menu.
     */
    public void areaCalculator(){
        introduction();
        menu();
    }
}
