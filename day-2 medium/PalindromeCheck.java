import java.util.Scanner;

public class PalindromeCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Case (1 for String, 2 for Number): ");
        int choice = scanner.nextInt();
        scanner.nextLine(); 

        switch (choice) {
            case 1:
                System.out.print("Enter a String: ");
                String str = scanner.nextLine();
                if (isPalindrome(str)) {
                    System.out.println("Palindrome");
                } else {
                    System.out.println("Not a Palindrome");
                }
                break;

            case 2:
                System.out.print("Enter a Number: ");
                int num = scanner.nextInt();
                if (isPalindrome(Integer.toString(num))) {
                    System.out.println("Palindrome");
                } else {
                    System.out.println("Not a Palindrome");
                }
                break;

            default:
                System.out.println("Invalid choice");
        }

        scanner.close();
    }
    public static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
