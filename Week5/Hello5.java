package Week5;

public class Hello5 {
    // 1. Make a method to check if a number is prime or not.
    public static void prime(int n){
        int div=0;
        for(int i=2;i<=n;i++){
            if(n%i==0){
                div+=1;
            }
        }
        if(div>1){
            System.out.println("Not prime");
        }else{
            System.out.println("prime");
        }
    }

    // 2. Make a method to check if a given number n is even or not.
    public static void evenOrNot(int n){
        String res = (n%2==0)?"Even":"Odd";
        System.out.println(res);
    }

    // 3. Make a method to print the table of a given number n.
    public static void table(int n){
        for(int i=1; i<11; i++){
            System.out.println(n+" * "+i+"="+(n*i));
        }
    }

    // 4. Write a program for multiplying 3 numbers using a method and return the result and print the result from the main method.
    public static int threeNum(int a, int b, int c){
        return a*b*c;
    }

    // 5. Write a program for calculating Simple Interest using a method and print the result from the method itself.
    public static void si(double p, double t, double r){
        System.out.println("Simple Interest: "+(p*t*r/100));
    }

    // 6. Write a program to calculate the area of a rectangle using a method of your choice.
    public static void areaRect(double l, double b){
        System.out.println("Area: "+(l*b));
    }

    // 7. Calculates the factorial of a given number using the Java method.
    public static void fact(int n){
        int fact=1;
        for(int i=1; i<=n; i++){
            fact*=i;
        }
        System.out.println("Factorial: "+fact);
    }
    // 8. Calculate the nth Fibonacci number using the method.
    public static void fibo(int n){
        int first = 1;
        int second = 1;
        System.out.print(1+" ");
        for(int i=0; i<n-1; i++){
            System.out.print(second+" ");
            int temp = second;
            second+=first;
            first=temp;
        }
    }
    // 9. Write a Java program to find the greatest common divisor (GCD) of two numbers.
    public static void gcd(int a, int b){
        int gcd = 1;

    for (int i = 1; i <= Math.min(a, b); i++) {
        if (a % i == 0 && b % i == 0) {
            gcd = i;
        }
    }
    System.out.println("Gcd is " + gcd);
    }

    /* 10. Write a Java program to display all prime numbers less than a given number and count all the prime numbers less than that number using functions. */
    public static void print_prime_less_than(int n){
        for(int i=2; i<n; i++){
            boolean isPrime=true;
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
           System.out.println(Hello5.threeNum(1, 2, 3));
           Hello5.print_prime_less_than(20);
           
    }
    
}
