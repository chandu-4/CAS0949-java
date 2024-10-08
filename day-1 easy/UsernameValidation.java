import java.util.Scanner;

public class UsernameValidation {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a username: ");
            String username = scanner.nextLine();
            if (isValidUsername(username)) {
                System.out.println("Username is valid.");
            } else {
                System.out.println("Username is invalid. It must be at least 5 characters long and not contain spaces.");
            }
        }
    }
    public static boolean isValidUsername(String username) {
        return username.length() >= 5 && !username.contains(" ");
    }
}
