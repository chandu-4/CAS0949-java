import java.util.Scanner;

public class SpecialCharacterCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a statement: ");
        String statement = scanner.nextLine();

        int specialCharacterCount = 0;

        for (int i = 0; i < statement.length(); i++) {
            char ch = statement.charAt(i);
            if (!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)) {
                specialCharacterCount++;
            }
        }

        System.out.println("Number of special characters: " + specialCharacterCount);

        scanner.close();
    }
}
