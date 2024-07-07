package Week7;

public class Hello7 {
    
}
// 1. Write a Java program to create a class called "Circle" with a radius attribute. You can access this attribute using setter and getter method. Calculate the area and circumference of the circle.
class Circle {
    private double r = 7;

    double areaOfRect(){
        return Math.PI*r*r;
    }

    double perimeterOfRect(){
        return 2*Math.PI*r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
}
// 2. Write a Java program to create a class called “Simple Interest” with a data fields principle, time and rate, using setter getter method and print the values.
class SI {
    private int principal;
    private int time;
    private int rate;
    public int getPrincipal() {
        return principal;
    }
    public void setPrincipal(int principal) {
        this.principal = principal;
    }
    public void setTime(int time) {
        this.time = time;
    }
    public void setRate(int rate) {
        this.rate = rate;
    }
    public int getTime() {
        return time;
    }
    public int getRate() {
        return rate;
    }
    
}
// 3. Write a Java program to create a class called "Dog" with a name and breed attribute. Create two instances of the "Dog" class, set their attributes using the constructor and modify the attributes using the setter methods and print the updated values.
class Dog{
    private String name;
    private String breed;
    Dog(String name, String breed){
        this.name = name;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }
    public String getBreed() {
        return breed;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
}

// 4. Write a Java program to create a class called "Employee" with a name, job title, and salary attributes, and methods to calculate and update salary.
class Employee {
    private String name;
    private String title;
    private double salary;
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getName() {
        return name;
    }
    public String getTitle() {
        return title;
    }
    
}