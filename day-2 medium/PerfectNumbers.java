import java.util.Scanner;

public class PerfectNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of perfect numbers to display: ");
        int n = scanner.nextInt();

        int count = 0;
        int num = 1;

        while (count < n) {
            if (isPerfect(num)) {
                System.out.println(num);
                count++;
            }
            num++;
        }

        scanner.close();
    }

    public static boolean isPerfect(int num) {
        int sum = 0;

        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        return sum == num;
    }
}
