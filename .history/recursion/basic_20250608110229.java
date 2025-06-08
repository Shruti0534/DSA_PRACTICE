import java.util.*;
public  class basic {
    // Recursive method to calculate factorial
    public static int factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        return n * factorial(n - 1);
    } 
    public static int fibonacci(int n) {
        if (n <= 1)
            return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    public static int pow(int base,int exp)

    public static void main(String[] args) {
        int num = 5; 
        System.out.println("Factorial of " + num + " is " + factorial(num));
        System.out.println(fibonacci(num) + " is the " + num + "th Fibonacci number");
    }
}