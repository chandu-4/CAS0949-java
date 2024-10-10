import java.util.Scanner;
public class DecimalConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Decimal number: ");
        int decimalNumber = scanner.nextInt();
        String binary = Integer.toBinaryString(decimalNumber);
        String octal = Integer.toOctalString(decimalNumber);
        System.out.println("Binary Equivalent: " + binary);
        System.out.println("Octal Equivalent: " + octal);
        scanner.close();
    }
}
