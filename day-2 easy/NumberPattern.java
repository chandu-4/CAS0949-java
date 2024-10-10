import java.util.Scanner;

public class NumberPattern {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number to be printed: ");
        int num = scanner.nextInt();

        System.out.print("Max Number of time printed: ");
        int maxPrint = scanner.nextInt();

        for (int i = 1; i <= maxPrint; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num);
            }
            System.out.println();
        }

        for (int i = maxPrint - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num);
            }
            System.out.println();
        }

        scanner.close();
    }
}
