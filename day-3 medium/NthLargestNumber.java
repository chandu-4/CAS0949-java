import java.util.Arrays;
import java.util.Scanner;

public class NthLargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();

        Arrays.sort(array);
                if (n <= size) {
            System.out.println("The " + n + "th largest number is: " + array[size - n]);
        } else {
            System.out.println("N is larger than the size of the array.");
        }

        scanner.close();
    }
}
