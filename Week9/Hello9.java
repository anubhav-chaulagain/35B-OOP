package Week9;

public class Hello9 {
    public static void main(String[] args) {
        // Creating an instance of Rectangle
        Rectangle rectangle = new Rectangle(5.0, 3.0);
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());

        // Creating an instance of Circle
        Circle circle = new Circle(4.0);
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Circle Circumference: " + circle.calculateCircumference());
    }
}
// 1. Write a Java program to create a class called Vehicle with a method called drive(). Create a subclass called Car with method display() method to print details of the Car.
// class Vehicle {
//     String name;
//     String model;
//     int year;
//     void drive() {
//         System.out.println("Vehicle is driving");
//     }
// }

// class Car extends Vehicle {
//     Car(String name, String model, int year) {
//         this.name = name;
//         this.model = model;
//         this.year = year;
//     }
//     void display() {
//         System.out.println(this.name+this.model+this.year);
//     }
// }
//2. Write a Java program to create a class called Employee with methods called work() and getSalary(). Create a subclass called HRManager that overrides the work() method.
class Employee {
    public void work() {
        System.out.println("Employee is working.");
    }

    public double getSalary() {
        return 50000;
    }
}

class HRManager extends Employee {
    @Override
    public void work() {
        System.out.println("HR Manager is managing human resources.");
    }
}

//4. Design a class hierarchy for different types of vehicles. Create a base class 'Vehicle' with methods 'startEngine()' and 'stopEngine()'. Derive two classes 'Car' and 'Motorcycle' from 'Vehicle'. Add methods 'drive()' in 'Car' and 'ride()' in 'Motorcycle'. Write a Java program to demonstrate hierarchical inheritance and invoke the relevant methods for a car and a motorcycle object.
class Vehicle {
    public void startEngine() {
        System.out.println("Engine started.");
    }

    public void stopEngine() {
        System.out.println("Engine stopped.");
    }
}

class Car extends Vehicle {
    public void drive() {
        System.out.println("Car is being driven.");
    }
}

class Motorcycle extends Vehicle {
    public void ride() {
        System.out.println("Motorcycle is being ridden.");
    }
}

// 5. Implement a class hierarchy for various shapes. Create a base class 'Shape' with a method 'calculateArea()'. Derive two classes 'Rectangle' and 'Circle' from 'Shape'. Add additional methods 'calculatePerimeter()' in 'Rectangle' and 'calculateCircumference()' in 'Circle'. Write a Java program to demonstrate hierarchical inheritance and compute the area and perimeter/circumference for a rectangle and a circle object.
abstract class Shape {
    public abstract double calculateArea();
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
}

//6. Let's examine the Java program given. It involves multiple classes that depict different book types, including Book, FictionBook, NonFictionBook, and TechnicalBook. The Book class features a constructor and a method called displayDetails(). This method is responsible for outputting the title and author of a book. The remaining classes inherit both the constructor and methods of the Book class as they extend it.
class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

class FictionBook extends Book {
    public FictionBook(String title, String author) {
        super(title, author);
    }

}

class NonFictionBook extends Book {
    public NonFictionBook(String title, String author) {
        super(title, author);
    }

}

class TechnicalBook extends Book {
    public TechnicalBook(String title, String author) {
        super(title, author);
    }

}




