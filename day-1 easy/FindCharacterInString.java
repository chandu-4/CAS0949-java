import java.util.Scanner;
public class FindCharacterInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        System.out.print("Enter the character to search for: ");
        char searchChar = scanner.next().charAt(0);
        int index = -1;
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == searchChar) {
                index = i;  
                break;   
            }
        }
        if (index != -1) {
            System.out.println("The character '" + searchChar + "' is present at index: " + index);
        } else {
            System.out.println("The character '" + searchChar + "' is not present in the string.");
        }
        scanner.close();
    }
}
