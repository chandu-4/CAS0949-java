import java.util.Scanner;

public class Factorial {

    public static long factorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a number:");
        int n = scanner.nextInt();
        
        long result = factorial(n);
        
        System.out.println("Factorial of " + n + " is: " + result);
        
        scanner.close();
    }
}
