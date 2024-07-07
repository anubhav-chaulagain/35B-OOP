package Week10;

import java.util.Scanner;

public class Hello10 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.sound();
        cat.sound();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter width of the rectangle: ");
        double width = scanner.nextDouble();
        Shape rectangle = new Rectangle(length, width);
        System.out.println("Rectangle Area: " + rectangle.calculateArea());

        System.out.print("Enter radius of the circle: ");
        double radius = scanner.nextDouble();
        Shape circle = new Circle(radius);
        System.out.println("Circle Area: " + circle.calculateArea());

        Car car = new Car();
        Motorcycle motorcycle = new Motorcycle();
        car.startEngine();
        car.stopEngine();
        motorcycle.startEngine();
        motorcycle.stopEngine();

        Cube cube = new Cube(3);
        System.out.println("Cube Volume: " + cube.calculateVolume());
        System.out.println("Cube Area: " + cube.calculateArea());
        System.out.println("Cube Perimeter: " + cube.calculatePerimeter());

        Cuboid cuboid = new Cuboid(3, 4, 5);
        System.out.println("Cuboid Volume: " + cuboid.calculateVolume());
        System.out.println("Cuboid Area: " + cuboid.calculateArea());
        System.out.println("Cuboid Perimeter: " + cuboid.calculatePerimeter());

        Cylinder cylinder = new Cylinder(3, 5);
        System.out.println("Cylinder Volume: " + cylinder.calculateVolume());
        System.out.println("Cylinder Area: " + cylinder.calculateArea());
        System.out.println("Cylinder Perimeter: " + cylinder.calculatePerimeter());

        VideoPlayer videoPlayer = new VideoPlayer();
        videoPlayer.play();
        videoPlayer.pause();
        videoPlayer.stop();
        videoPlayer.addSong("Song 1");
        videoPlayer.removeSong("Song 1");
        videoPlayer.rewind();
        videoPlayer.fastForward();
    }
}

abstract class Animal {
    public abstract void sound();
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Woof Woof");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Meow Meow");
    }
}

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

abstract class Vehicle {
    public abstract void startEngine();
    public abstract void stopEngine();
}

class Car extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Car engine started.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Car engine stopped.");
    }
}

class Motorcycle extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Motorcycle engine started.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Motorcycle engine stopped.");
    }
}

abstract class Draw {
    public abstract double calculateVolume();
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}

class Cube extends Draw {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    public double calculateVolume() {
        return Math.pow(side, 3);
    }

    @Override
    public double calculateArea() {
        return 6 * Math.pow(side, 2);
    }

    @Override
    public double calculatePerimeter() {
        return 12 * side;
    }
}

class Cuboid extends Draw {
    private double length;
    private double width;
    private double height;

    public Cuboid(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateVolume() {
        return length * width * height;
    }

    @Override
    public double calculateArea() {
        return 2 * (length * width + width * height + height * length);
    }

    @Override
    public double calculatePerimeter() {
        return 4 * (length + width + height);
    }
}

class Cylinder extends Draw {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double calculateVolume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    @Override
    public double calculateArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

interface Playlist {
    void addSong(String song);
    void removeSong(String song);
}

class MediaPlayer {
    public void play() {
        System.out.println("Playing media.");
    }

    public void pause() {
        System.out.println("Pausing media.");
    }

    public void stop() {
        System.out.println("Stopping media.");
    }
}

class VideoPlayer extends MediaPlayer implements Playlist {
    @Override
    public void addSong(String song) {
        System.out.println("Adding song: " + song);
    }

    @Override
    public void removeSong(String song) {
        System.out.println("Removing song: " + song);
    }

    public void rewind() {
        System.out.println("Rewinding video.");
    }

    public void fastForward() {
        System.out.println("Fast-forwarding video.");
    }
}

interface Employee {
    void work();
    double getSalary();
}

interface LibraryItem {
    String getTitle();
    String getAuthor();
    int getYear();
    boolean isAvailable();
}
