import java.util.Scanner;

public class CharacterPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Character to be printed: ");
        char ch = scanner.next().charAt(0);

        System.out.print("Max Number of times printed: ");
        int maxCount = scanner.nextInt();

        for (int i = 1; i <= maxCount; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
