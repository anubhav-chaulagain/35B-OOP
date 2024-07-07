package Week11;


public class Hello11 {
    public static void main(String[] args) {
        // Question 1: Shape drawing application
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        Shape triangle = new Triangle(3, 4);

        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Triangle Area: " + triangle.calculateArea());

        // Question 2: Payment processing application
        PaymentMethod creditCard = new CreditCard();
        PaymentMethod payPal = new PayPal();
        PaymentMethod bankTransfer = new BankTransfer();

        creditCard.processPayment(100);
        payPal.processPayment(200);
        bankTransfer.processPayment(300);

        // Question 3: Car rental system
        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();
        Vehicle bicycle = new Bicycle();

        System.out.println("Car rental cost for 5 days: $" + car.calculateRentalCost(5));
        System.out.println("Motorcycle rental cost for 3 days: $" + motorcycle.calculateRentalCost(3));
        System.out.println("Bicycle rental cost for 2 days: $" + bicycle.calculateRentalCost(2));

        // Question 4: Restaurant ordering system
        MenuItem appetizer = new Appetizer();
        MenuItem mainCourse = new MainCourse();
        MenuItem beverage = new Beverage();

        appetizer.prepare();
        appetizer.serve();

        mainCourse.prepare();
        mainCourse.serve();

        beverage.prepare();
        beverage.serve();

        // Question 5: Shape manipulation application
        ShapeManipulator resizableCircle = new ResizableCircle(5);
        ShapeManipulator resizableSquare = new ResizableSquare(4);

        resizableCircle.resize(2);
        resizableCircle.rotate(90);

        resizableSquare.resize(1.5);
        resizableSquare.rotate(45);

        // Question 6: Calculator application
        Calculator calculator = new Calculator();

        System.out.println("Addition (int): " + calculator.add(5, 3));
        System.out.println("Addition (double): " + calculator.add(5.5, 3.5));
        System.out.println("Addition (three integers): " + calculator.add(5, 3, 2));

        // Question 7: Geometry application
        Geometry geometry = new Geometry();

        System.out.println("Circle Area: " + geometry.calculateArea(5));
        System.out.println("Rectangle Area: " + geometry.calculateArea(4, 6));
        System.out.println("Triangle Area: " + geometry.calculateArea(3, 4, true));

        // Question 8: Payroll system
        Employee employee = new Employee();
        Manager manager = new Manager();

        employee.calculateSalary();
        manager.calculateSalary();

        // Question 9: Banking application
        Account savingsAccount = new SavingsAccount();
        Account fixedDepositAccount = new FixedDepositAccount();

        System.out.println("Interest on savings account (amount $1000): $" + savingsAccount.calculateInterest(1000));
        System.out.println("Interest on fixed deposit account (amount $2000): $" + fixedDepositAccount.calculateInterest(2000));

        // Question 10: Game character application
        Character character = new Character();
        Warrior warrior = new Warrior();
        Mage mage = new Mage();

        character.attack();
        warrior.attack();
        mage.attack();
    }
}

// Question 1: Shape drawing application
abstract class Shape {
    public abstract double calculateArea();
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
}

class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

// Question 2: Payment processing application
abstract class PaymentMethod {
    public abstract void processPayment(double amount);
}

class CreditCard extends PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}

class PayPal extends PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}

class BankTransfer extends PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing bank transfer payment of $" + amount);
    }
}

// Question 3: Car rental system
abstract class Vehicle {
    public abstract double calculateRentalCost(int days);
}

class Car extends Vehicle {
    @Override
    public double calculateRentalCost(int days) {
        return days * 50.0; // $50 per day
    }
}

class Motorcycle extends Vehicle {
    @Override
    public double calculateRentalCost(int days) {
        return days * 30.0; // $30 per day
    }
}

class Bicycle extends Vehicle {
    @Override
    public double calculateRentalCost(int days) {
        return days * 10.0; // $10 per day
    }
}

// Question 4: Restaurant ordering system
abstract class MenuItem {
    public abstract void prepare();
    public abstract void serve();
}

class Appetizer extends MenuItem {
    @Override
    public void prepare() {
        System.out.println("Preparing appetizer.");
    }

    @Override
    public void serve() {
        System.out.println("Serving appetizer.");
    }
}

class MainCourse extends MenuItem {
    @Override
    public void prepare() {
        System.out.println("Preparing main course.");
    }

    @Override
    public void serve() {
        System.out.println("Serving main course.");
    }
}

class Beverage extends MenuItem {
    @Override
    public void prepare() {
        System.out.println("Preparing beverage.");
    }

    @Override
    public void serve() {
        System.out.println("Serving beverage.");
    }
}

// Question 5: Shape manipulation application
abstract class ShapeManipulator {
    public abstract void resize(double factor);
    public abstract void rotate(double angle);
}

class ResizableCircle extends ShapeManipulator {
    private double radius;

    public ResizableCircle(double radius) {
        this.radius = radius;
    }

    @Override
    public void resize(double factor) {
        radius *= factor;
        System.out.println("Resized circle with new radius: " + radius);
    }

    @Override
    public void rotate(double angle) {
        System.out.println("Rotated circle by angle: " + angle);
    }
}

class ResizableSquare extends ShapeManipulator {
    private double sideLength;

    public ResizableSquare(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public void resize(double factor) {
        sideLength *= factor;
        System.out.println("Resized square with new side length: " + sideLength);
    }

    @Override
    public void rotate(double angle) {
        System.out.println("Rotated square by angle: " + angle);
    }
}

// Question 6: Calculator application
class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

// Question 7: Geometry application
class Geometry {
    public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public double calculateArea(double length, double width) {
        return length * width;
    }

    public double calculateArea(double base, double height, boolean type) {
        if (type) {
            return 0.5 * base * height; // Triangle
        } else {
            return base * height; // Rectangle
        }
    }
}

// Question 8: Payroll system
class Employee {
    public void calculateSalary() {
        System.out.println("Calculating salary of employee.");
    }
}

class Manager extends Employee {
    @Override
    public void calculateSalary() {
        super.calculateSalary();
        System.out.println("Calculating bonus for manager.");
    }
}

// Question 9: Banking application
abstract class Account {
    public abstract double calculateInterest(double amount);
}

class SavingsAccount extends Account {
    @Override
    public double calculateInterest(double amount) {
        return amount * 0.05; // 5% interest rate
    }
}

class FixedDepositAccount extends Account {
    @Override
    public double calculateInterest(double amount) {
        return amount * 0.08; // 8% interest rate
    }
}

// Question 10: Game character application
class Character {
    public void attack() {
        System.out.println("Basic attack action of character.");
    }
}

class Warrior extends Character {
    @Override
    public void attack() {
        System.out.println("Warrior's sword attack!");
    }
}

class Mage extends Character {
    @Override
    public void attack() {
        System.out.println("Mage's fireball attack!");
    }
}

