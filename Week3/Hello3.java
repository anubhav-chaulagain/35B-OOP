package Week3;
import java.util.Scanner;

public class Hello3 {
    
    public static void main(String[] args) {
        /* 1. Write a JAVA program to find the maximum between three numbers. */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 3 num: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        int maxNum = (num1>num2 && num1>num3)? num1: (num2>num3)? num2: num3;
        System.out.println("Maximum number is "+ maxNum);

        /* 2. Write a JAVA program to check whether a number is negative, positive, or zero. */
        System.out.println("Enter a num: ");
        int num = scan.nextInt();
        String sign = (num>0)?"Positive":(num<0)?"Negative":"Zero";
        System.out.println("Number is "+ sign);

        /* 3. Write a JAVA program to check whether a number is divisible by 5 and 11 or not. */
        System.out.println("Enter a num: ");
        int num4 = scan.nextInt();
        String divi = (num4%5==0 && num4%11==0)?"Divisible":"Not divisible by 5 n 11";
        System.out.println("Number is "+ divi);

        /* 4. Write a JAVA program to check whether a number is even or odd. */
        System.out.println("Enter a num: ");
        int num5 = scan.nextInt();
        System.out.println((num5%2==0)?"Even":"Odd");

        /* 5. Write a JAVA program to check whether a year is a leap year or not. 
            Hint: if year%4==0; if year%100!==0 ; year%400==0;  */
        System.out.println("Enter a year: ");
        int year = scan.nextInt();
        System.out.println((year%4==0)?"Leap Year":"Not leap year");

        /* 6. Write a JAVA program to input any alphabet and check whether it is vowel or consonant. */
        System.out.println("Enter a alphabet: ");
        char alpha = scan.next().toLowerCase().charAt(0);
        System.out.println(("aeiou".indexOf(alpha)!= -1)? "Vowel":"Consonant");

        /* 1. Write a Java program that takes a student's grade as input (A, B, C, D, or F) and converts it to the corresponding GPA value. Use a switch case statement to handle different grades. */
        System.out.println("Enter your grades (A, B, C, D, or F): ");
        char grade = scan.next().toUpperCase().charAt(0);
        switch(grade){
            case 'A':
            System.out.println("3.6");
            break;

            case 'B':
            System.out.println("2.8");
            break;

            case 'C':
            System.out.println("2.0");
            break;

            case 'D':
            System.out.println("1.2");
            break;

            case 'F':
            System.out.println("0.6");
            break;
        }

        /* 2. Create a Java program that takes two numbers and an operator (+, -, *, /) as inputs and performs the corresponding arithmetic operation using a switch case statement. */
        System.out.println("Enter 2 num: ");
        int num6 = scan.nextInt();
        int num7 = scan.nextInt();
        System.out.println("Enter operator");

        char op = scan.next().charAt(0);

        switch(op) {
            case '+':
            System.out.println("The sum is "+(num6+num7));
            break;

            case '-':
            System.out.println("The difference is "+(num6-num7));
            break;

            case '*':
            System.out.println("The product is "+(num6*num7));
            break;

            case '/':
            System.out.println("The quotient is "+(num6/num7));
            break;

            default:
            System.out.println("Invalid Operator");
            break;
        }

        /* 3. Write a Java program that takes an integer input (1 to 12) representing a month and prints the corresponding season (e.g., 1-3: Winter, 4-6: Spring, 7-9: Summer, 10-12: Fall) using a switch case. */
        System.out.println("Enter the month number: ");
        int month = scan.nextInt();
        switch(month) {
            case(1):
            case(2):
            case(3):
            System.out.println("Winter");
            break;

            case(4):
            case(5):
            case(6):
            System.out.println("Spring");
            break;

            case(7):
            case(8):
            case(9):
            System.out.println("Summer");
            break;

            case(10):
            case(11):
            case(12):
            System.out.println("Fall");
            break;
        }

        /* 4. Implement a Java program that calculates the area of different shapes (circle, rectangle, square, triangle) based on the user's choice using a switch case. */
        System.out.println("Enter the shape you want area of (circle, rectangle, square, triangle): ");
        String shape = scan.next();
        switch (shape) {
            case "rectangle":
            System.out.println("Enter length and breadth in decimal: ");
            double leng = scan.nextDouble();
            double bread = scan.nextDouble();
            double arear = leng*bread;
            int arearTypeCasted = (int) arear;
            System.out.println("Typecasted area of rectangle is "+ arearTypeCasted);
            break;

            case "square":
            System.out.println("Enter length of square: ");
            int le = scan.nextInt();
            System.out.println("Area of sq: "+le*le);
            break;

            case "triangle":
            System.out.println("Enter base and height: ");
            int base = scan.nextInt();
            int height = scan.nextInt();
            System.out.println("Area of triangle: "+base*height/2);
            break;

            case "circle":
            System.out.println("Enter the radius of the circle: ");
            double r = scan.nextDouble();
            System.out.println("The area of the circle is "+(Math.PI*r*r));
            break;
        
            default:
                break;
        }
        scan.close();
    }

}
