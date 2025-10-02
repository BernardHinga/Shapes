package org.example;

import java.util.Scanner;

public class Area {
//    Instantiate all objects
    Square square = new Square(0);
    Rectangle rectangle = new Rectangle(0, 0);
    Triangle triangle = new Triangle(0, 0);
    Circle circle = new Circle(0);

    public double Area;
    public double length;
    public double width;
    public double height;
    public double base;
    public double radius;

    Scanner userInput = new Scanner(System.in);

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

    public void menu() {
        System.out.println("Enter which shape you want to calculate for:\t\t Or type 'exit' to end the program");

        String shape = userInput.nextLine();
        shape = shape.toLowerCase();

        switch (shape) {
            case "square":
                // Get user input for dimensions
                System.out.println("Enter the length of the square:");
                length = userInput.nextDouble();

                // Set the values and calculate the area
                square.setLength(length);
                Area = square.area();

                // Output the result
                System.out.println("The area of the square of length " + square.getLength() + " is: " + Area);
                menu();

            case "rectangle":
                // Get user input for dimensions
                System.out.println("Enter the length of the rectangle:");
                length = userInput.nextDouble();
                System.out.println("Enter the width of the rectangle:");
                width = userInput.nextDouble();

                // Set the values and calculate the area
                rectangle.setLength(length);
                rectangle.setWidth(width);
                Area = rectangle.area();

                // Output the result
                System.out.println("The area of the rectangle of length " + rectangle.getLength() + " and width " + rectangle.getWidth() + " is: " + Area);
                menu();

            case "triangle":
                // Get user input for dimensions
                System.out.println("Enter the base of the triangle:");
                base = userInput.nextDouble();
                System.out.println("Enter the height of the triangle:");
                height = userInput.nextDouble();

                // Set the values and calculate the area
                triangle.setBase(base);
                triangle.setHeight(height);
                Area = triangle.area();

                // Output the result
                System.out.println("The area of the triangle of base " + triangle.getBase() + " and height " + triangle.getHeight() + " is: " + Area);
                menu();

            case "circle":
                // Get user input for dimensions
                System.out.println("Enter the radius of the circle:");
                radius = userInput.nextDouble();

                // Set the values and calculate the area
                circle.setRadius(radius);
                Area = circle.area();

                // Output the result
                System.out.println("The area of the circle of radius " + circle.getRadius() + " is: " + Area);
                menu();

            case "exit":
                System.out.println("Thank you for using our program.");
                break;

            default:
                System.out.println("Invalid shape entered. Please try again.");
                menu();
        }
    }


    public void areaCalculator(){
        introduction();
        menu();
    }

}
