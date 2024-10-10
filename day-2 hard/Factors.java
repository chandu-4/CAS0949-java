import java.util.Scanner;
public class Factors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        System.out.print("Enter the nth factor to find: ");
        int n = scanner.nextInt();
        System.out.println("Factors of " + num + ":");
        int factorCount = 0;
        int nthFactor = -1;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factorCount++;
                System.out.print(i + " "); 
                if (factorCount == n) {
                    nthFactor = i;
                }
            }
        }
        System.out.println("\nTotal number of factors: " + factorCount);
        if (nthFactor != -1) {
            System.out.println("The " + n + "th factor is: " + nthFactor);
        } else {
            System.out.println("The " + n + "th factor does not exist.");
        }

        scanner.close();
    }
}
