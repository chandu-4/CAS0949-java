import java.util.Scanner;

public class SpecialCharacterCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a line of text: ");
        String input = scanner.nextLine();

        StringBuilder specialCharacters = new StringBuilder();
        int specialCharCount = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (!Character.isLetterOrDigit(ch)) {
                specialCharacters.append(ch).append(" ");
                specialCharCount++;
            }
        }

        if (specialCharCount > 0) {
            System.out.println("Special Characters: " + specialCharacters.toString().trim());
        } else {
            System.out.println("No special characters found.");
        }

        // Display the total number of special characters
        System.out.println("Number of special characters: " + specialCharCount);

        // Close the scanner
        scanner.close();
    }
}
