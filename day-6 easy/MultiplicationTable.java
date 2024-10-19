import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number (m): ");
        int m = scanner.nextInt();

        System.out.print("Enter the limit (n): ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(m + " x " + i + " = " + (m * i));
        }
    }
}
