# Shape Area Calculator (Java)

A simple **Object-Oriented Programming (OOP)** project that calculates the area of geometric shapes — Square, Rectangle, Triangle, and Circle.

---

## 🎯 Purpose

This project demonstrates core OOP principles:
- **Encapsulation** – each shape’s properties are private, accessed via getters/setters.
- **Abstraction** – each shape class hides its internal implementation (formula) behind an `area()` method.
- **Composition** – the `Area` class uses instances of `Square`, `Rectangle`, `Triangle`, and `Circle` to build a larger system.
- **Reusability** – separate classes for each shape allow easy extension (adding more shapes).

---

## 🧩 Project Structure

```
org/example/
 ├── Area.java        → main program logic (menu, user interaction)
 ├── Circle.java      → circle area formula
 ├── Rectangle.java   → rectangle area formula
 ├── Square.java      → square area formula
 └── Triangle.java    → triangle area formula
```

---

## 🚀 How to Run

1. Compile all files:
   ```bash
   javac org/example/*.java
   ```

2. Run the main class (e.g., from the project root):
   ```bash
   java org.example.Area
   ```

---

## 💡 Example Output

```
========================================
        SHAPE AREA CALCULATOR
========================================
Welcome! This program helps you calculate 
the area of different shapes.

Available Shapes:
  1. Square
  2. Rectangle
  3. Triangle
  4. Circle

----------------------------------------

Enter which shape you want to calculate for: square
Enter the length of the square:
4
The area of the square of length 4.0 is: 16.0
```

---

## 🧠 Concepts Demonstrated

| Concept | Description | Example |
|----------|--------------|----------|
| **Encapsulation** | Private fields, getters/setters | `private double length;` |
| **Constructor** | Initializes object attributes | `public Square(double length)` |
| **Abstraction** | Simplified interface for users | `area()` methods |
| **Composition** | One class uses another class | `Area` contains `Square`, `Circle`, etc. |
| **Polymorphism (potential)** | Could be added later using inheritance | `Shape` interface (future upgrade) |

---

## 🔮 Possible Improvements
- Introduce a **common interface or abstract class** `Shape` with an `area()` method.
- Add **input validation** (e.g., handle non-numeric inputs).
- Add **perimeter** calculations for more functionality.
- Replace recursion in menu with a while-loop for better structure.

---

**Concepts:** OOP, Encapsulation, Composition, User Interaction
