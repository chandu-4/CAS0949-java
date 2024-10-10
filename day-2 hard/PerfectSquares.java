import java.util.ArrayList;
import java.util.Scanner;

public class PerfectSquares {
    public static boolean isSumOfDigitsLessThan10(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum < 10;
    }
    public static ArrayList<Integer> findPerfectSquares(int start, int end) {
        ArrayList<Integer> perfectSquaresList = new ArrayList<>();

        for (int i = 1; i * i <= end; i++) {
            int square = i * i;
            if (square >= start && square <= end && isSumOfDigitsLessThan10(square)) {
                perfectSquaresList.add(square);
            }
        }

        return perfectSquaresList;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the start of the range: ");
        int start = scanner.nextInt();

        System.out.print("Enter the end of the range: ");
        int end = scanner.nextInt();

        ArrayList<Integer> result = findPerfectSquares(start, end);
        System.out.println("Perfect squares in the range [" + start + ", " + end + "] with sum of digits less than 10 are:");
        for (int square : result) {
            System.out.print(square + " ");
        }

        scanner.close();
    }
}
