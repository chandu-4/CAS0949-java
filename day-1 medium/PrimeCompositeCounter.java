import java.util.Scanner;
public class PrimeCompositeCounter {
        public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; 
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; 
            }
        }
        return true; 
    }
    public static void main(String[] args) {
            try (Scanner scanner = new Scanner(System.in)) {
                System.out.print("Enter the number of elements: ");
                int n = scanner.nextInt();
                int primeCount = 0;
                int compositeCount = 0;
                System.out.println("Enter the numbers:");
                for (int i = 0; i < n; i++) {
                    int num = scanner.nextInt();
                    if (isPrime(num)) {
                        primeCount++;
                    } else if (num > 1) {
                        compositeCount++; 
                    }
                }
                System.out.println("Prime number: " + primeCount);
                System.out.println("Composite number: " + compositeCount);
            }
    }
}

