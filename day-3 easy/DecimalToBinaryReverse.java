import java.util.Scanner;

public class DecimalToBinaryReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();
        String binaryString = Integer.toBinaryString(decimal);
        System.out.println("Binary representation: " + binaryString);
        String reversedBinaryString = new StringBuilder(binaryString).reverse().toString();
        System.out.println("Reversed binary: " + reversedBinaryString);
        int reversedDecimal = Integer.parseInt(reversedBinaryString, 2);
        System.out.println("Decimal after reversing binary: " + reversedDecimal);
        scanner.close();
    }
}
