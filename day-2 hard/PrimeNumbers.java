import java.util.Scanner;

public class PrimeNumbers {
    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static int findNthPrime(int n) {
        int count = 0;
        int number = 1;

        while (count < n) {
            number++;
            if (isPrime(number)) {
                count++;
            }
        }
        return number;
    }

    public static void printNPrimesAfter(int startPrime, int n) {
        int count = 0;
        int number = startPrime + 1;

        while (count < n) {
            if (isPrime(number)) {
                System.out.print(number + " ");
                count++;
            }
            number++;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = scanner.nextInt();

        int nthPrime = findNthPrime(n);

        System.out.println(n + "rd Prime number is " + nthPrime);

        System.out.print(n + " prime numbers after " + nthPrime + " are: ");
        printNPrimesAfter(nthPrime, n);

        scanner.close();
    }
}
