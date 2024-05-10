package Week4;

import java.util.Scanner;

public class Hello4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // // 1. Write a program that asks your name and prints “Hello your name” five times. Use a loop.
        System.out.println("Enter your name");
        String name = scan.nextLine();
        for(int i=0; i<5; i++){
            System.out.println(name);
        }

        // 2. Write a program that displays the following table (note that 1 mile is 1.609 kilometers):
        System.out.println("Mile                Km");
        for(int i=1;i<11;i++){
            System.out.println(i + "                 "+ i*1.609);
        }

        // 3. Write a program that generates the following table: 
        System.out.println("Num                 Squared");
        for(int i=10;i>0;i--){
            System.out.println(i+"                   "+i*i);
        }

        // 4. Write a program that reads the width and generates a corresponding square of *.
        System.out.println("Enter the number you want square of: ");
        int n = scan.nextInt();
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // 5. Modify the above program by using a do..while loop so that it provides the user with the option to continue running the program and enter more inputs. 
        char ch;
        do{
            System.out.println("Enter a positive non-zero integer: ");
            int p = scan.nextInt();
            int sum = 0;
            System.out.print("Sum from 1 to "+p+" is ");
            for(int i =1; i<=p; i++){
                sum+=i;
            }
            System.out.print(sum);
            System.out.println("Enter y to continue: ");
            ch = scan.next().charAt(0);
        }while(ch=='y');
    
        // 6. Write a program that reads the width and generates a corresponding triangle of *
        System.out.println("Enter the number you want triangle of: ");
        int nu = scan.nextInt();
        for(int i=0; i<nu; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // 7. Write a program to calculate the HCF of Two given numbers.
        int a = scan.nextInt();
        int b = scan.nextInt();
        int smallerNumber = Math.min(a, b);
        int hcf = 1;

        for (int i = 1; i <= smallerNumber; i++) {
            if (a % i == 0 && b % i == 0) {
                hcf = i;
            }
        }
        System.out.println(hcf);

        // 8. Write a program that prompts the user to input an integer and then outputs the number with the digits reversed. For example, if the input is 12345, the output should be 54321.
        System.out.println("Enter any number: ");
        String stnum = scan.nextLine();
        char[]  rev= new char[stnum.length()];
        
        int j=0;
        for (int i = stnum.length() - 1; i >= 0; i--) {
            rev[j] = stnum.charAt(i);
            j++;
        }
        for(char i: rev){
            System.out.print(i);
        }

        //9. Write a program that reads ten integer numbers and outputs the number of inputs which are greater than 50, less than 50 or equal to 50. The program should also display the average of all numbers greater than 50 and the average of all numbers less than 50.
        int morethanfifty=0;
        int equaltofifty=0;
        int lessthanfifty=0;
        int avgmore = 0;
        int avgless = 0;
        for(int i=0;i<10;i++){
            System.out.println("Enter the number: ");
            int num = scan.nextInt();
            if(num>50){
                morethanfifty++;
                avgmore += num;
            }
            else if(num<50){
                lessthanfifty++;
                avgmore += num;
            }
            else{
                equaltofifty++;
            }
        }
        System.out.println("More than fifty: "+morethanfifty);
        System.out.println("Less than fifty: "+lessthanfifty);
        System.out.println("Equal than fifty: "+equaltofifty);
        System.out.println("Avg of more than fifty: "+avgmore/morethanfifty);
        System.out.println("Avg of less than fifty: "+avgless/lessthanfifty);

        // 10. Write a program that asks the user for a positive nonzero integer value. The program should use a loop to get the sum of all the integers from 1 up to the number entered.
        System.out.println("Enter any number: ");
        int fornum = scan.nextInt();
        int add=0;
        for(int i=1; i<=fornum; i++){
            add+=i;
        }
        System.out.println(add);
        scan.close();
    }
}
