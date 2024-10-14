import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        Arrays.sort(array);

        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < size; i++) {
            if (i == 0 || array[i] != array[i - 1]) {
                System.out.print(array[i] + " ");
            }
        }

        scanner.close();
    }
}
