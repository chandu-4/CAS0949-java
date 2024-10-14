import java.util.Scanner;

public class BinaryToDecimalAndOctal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        String binary = scanner.nextLine();
        int decimal = Integer.parseInt(binary, 2);
                String octal = Integer.toOctalString(decimal);
        System.out.println("Decimal equivalent: " + decimal);
        System.out.println("Octal equivalent: " + octal);

        scanner.close();
    }
}
