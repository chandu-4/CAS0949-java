import java.util.Arrays;
import java.util.Scanner;
public class MthMaximumNthMinimum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the array elements (comma separated): ");
        String input = scanner.nextLine();
        String[] inputArray = input.split(",");
        int[] arr = new int[inputArray.length];

        for (int i = 0; i < inputArray.length; i++) {
            arr[i] = Integer.parseInt(inputArray[i].trim());
        }

        System.out.print("Enter the value of M (for Mth maximum): ");
        int M = scanner.nextInt();
        System.out.print("Enter the value of N (for Nth minimum): ");
        int N = scanner.nextInt();

        Arrays.sort(arr);

        int MthMax = arr[arr.length - M];
        int NthMin = arr[N - 1];

        int sum = MthMax + NthMin;
        int difference = MthMax - NthMin;

        System.out.println(M + "st Maximum Number = " + MthMax);
        System.out.println(N + "th Minimum Number = " + NthMin);
        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + difference);

        scanner.close();
    }
}
