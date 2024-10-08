import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class SortNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfNames = 5;
        String[] names = new String[numberOfNames];
        System.out.println("Enter " + numberOfNames + " names:");
        for (int i = 0; i < numberOfNames; i++) {
            names[i] = scanner.nextLine();
        }
        System.out.print("Order (A for Ascending, D for Descending): ");
        String choice = scanner.nextLine().toUpperCase();
        if (choice.equals("A")) {
            Arrays.sort(names); 
            System.out.println("\nNames sorted in ascending order:");
        } else if (choice.equals("D")) {
            Arrays.sort(names, Collections.reverseOrder()); 
            System.out.println("\nNames sorted in descending order:");
        } else {
            System.out.println("Invalid choice. Sorting in ascending order by default.");
            Arrays.sort(names);
        }
        for (String name : names) {
            System.out.println(name);
        }
        scanner.close();
    }
}
