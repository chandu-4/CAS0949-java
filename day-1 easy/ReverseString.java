import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String word = scanner.nextLine();
            String reversedWord = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                reversedWord += word.charAt(i); 
            }
            System.out.println("Reverse String: " + reversedWord);
        }
    }
}
