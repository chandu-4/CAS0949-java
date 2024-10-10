import java.util.Scanner;

public class CompositeNumbers {

    public static boolean isComposite(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int compositeCount = 0;
        for (int num : arr) {
            if (isComposite(num)) {
                compositeCount++;
            }
        }

        System.out.println("Number of Composite Numbers = " + compositeCount);
    }
}
