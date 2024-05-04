package Week2;
import java.util.Scanner;

public class Hello2 {
    public static void main(String[] args) {
        /*1. Write a program to check whether a person can cast a vote or not. The condition is you must be over 18 years old to vote. */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scan.nextInt();

        if(age>18){
            System.out.println("You can cast vote");
        }
        else{
            System.out.println("You can't cast vote");
        }

        /*2. Write a program to calculate SI.  */
        System.out.println("Principal: ");
        double principal = scan.nextDouble();
        System.out.println("Time: ");
        double time = scan.nextDouble();
        System.out.println("Rate: ");
        double rate = scan.nextDouble();

        double si = (principal*time*rate)/100;
        System.out.println("Simple interest is "+ si);

        /* 3. Write a program to calculate, area of the triangle, and the Volume of the Cube and Cuboid. */
        System.out.println("Enter base and height: ");
        int base = scan.nextInt();
        int height = scan.nextInt();
        System.out.println("Area of triangle: "+base*height/2);

        System.out.println("Enter length, breadth and height: ");
        int len = scan.nextInt();
        int breadth = scan.nextInt();
        int hei = scan.nextInt();
        System.out.println("Area of cuboid is: "+len*breadth*hei);

        System.out.println("Enter length: ");
        int l = scan.nextInt();
        System.out.println("Area of cube: "+ l*l*l);

        /* 4. Write the ternary operator for question no. 1 */
        int ag = scan.nextInt();
        System.out.println(ag>18?"You can vote":"You can't vote");

        /* 5. Write a program to take two integer inputs from the user and print the sum and product of them. */
        System.out.println("Enter two numbers: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println("Sum: "+a+b);
        System.out.println("Product: "+a*b);

        /* 6. Take two integer inputs from the user. First, calculate the sum of two, then the product of two. Finally, calculate the division of the thus obtained sum and product and print the result. */
        System.out.println("Division: "+(a+b)/(a*b));

        /* 7. Take the name, roll number, and field of interest from the user and print in the format below: Hey, my name is XYZ and my roll number is XYZ. My field of interest are xyz. */
        System.out.println("Enter name: ");
        String name = scan.nextLine();
        System.out.println("Roll no: ");
        int rollno = scan.nextInt();
        System.out.println("Enter your interests seperated by commas(,): ");
        scan.nextLine();
        String interest = scan.nextLine();

        System.out.println();
        System.out.printf("Hey, my name is %s and my rollno is %d. My field of interests are %s.",name, rollno,interest);

        /* 8. Take side of a square from user and print area and perimeter of it. Also, calculate Simple Interest, Area of triangle and Volume of Cube and Cuboid. Take the attributes as user input. */
        System.out.println("Enter length of square: ");
        int le = scan.nextInt();
        System.out.println("Area of sq: "+le*le);
        System.out.println("Perimeter: "+(4*l));

        /* 9.  Ask user to give two double input for length and breadth of a rectangle and print area type casted to int. */
        System.out.println("Enter length and breadth in decimal: ");
        double leng = scan.nextDouble();
        double bread = scan.nextDouble();
        double arear = leng*bread;
        int arearTypeCasted = (int) arear;
        System.out.println("Typecasted area of rectangle is "+ arearTypeCasted);

        /* 10. Write a program to calculate the total marks of four subjects of a student and the total percentage secured. And use the following conditions to generate the final result;

        a. If equal to or more than 70 -> First Class

        b. If more than 59 -> Upper Second Class

        c. If more than 49 -> Second class

        d. If more than 39 -> Third class and if below than 40 the result is fail. 

        Hint: Use ternary operator */

        System.out.println("Enter marks of four subject oop, database, architecture and creative: ");
        int sub1 = scan.nextInt();
        int sub2 = scan.nextInt();
        int sub3 = scan.nextInt();
        int sub4 = scan.nextInt();
        int percent = (sub1+sub2+sub3+sub4)/4;
        
        String result = (percent >= 70) ? "First Class"
                      : (percent > 59) ? "Upper Second Class"
                      : (percent > 49) ? "Second Class"
                      : (percent > 39) ? "Third Class"
                      : "Fail";

        System.out.println("percent: " + percent + "%");
        System.out.println("Result: " + result);

        scan.close();
    }
}