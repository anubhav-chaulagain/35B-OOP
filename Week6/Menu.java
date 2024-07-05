package Week6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        boolean run = true;
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose the Options: ");
        System.out.print("1.    Add an element to the array\r\n" + //
                "\r\n" + //
                "2.    Display all the elements of the array\r\n" + //
                "\r\n" + //
                "3.    Reverse the elements of the array\r\n" + //
                "\r\n" + //
                "4.    Find the largest element of the array\r\n" + //
                "\r\n" + //
                "5.    Find the smallest element of the array\r\n" + //
                "\r\n" + //
                "6.    Exit the program");
        while(run){
            System.out.println();
            System.out.println("Enter your input here: ");
            int res = sc.nextInt();
            if(res==1){
                System.out.println("Enter the element you want to add: ");
                int add = sc.nextInt();
                arr.add(add);
            } else if(res==2){
                System.out.println("Displaying: ");
                for(int x: arr){
                    System.out.println(x);
                }
            } else if(res==3){
                Collections.reverse(arr);
                System.out.println("Reversed: ");
                for(int x: arr){
                    System.out.println(x);
                }
            } else if(res==4) {
                int max = arr.get(0);
                for(int x: arr){
                    if(x>max){
                        max=x;
                    }
                }
                System.out.println("Max: "+ max);
            } else if(res==5){
                int min = arr.get(0);
                for(int x: arr){
                    if(x<min){
                        min=x;
                    }
                }
                System.out.println("min: "+ min);
            } else if(res==6){
                run=false;
            }
        }
        sc.close();
        System.out.println("Terminated");
    }
}

