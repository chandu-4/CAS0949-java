import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int N = sc.nextInt();
        
        int[] numbers = new int[N];
        
        System.out.println("Enter " + N + " numbers:");
        for (int i = 0; i < N; i++) {
            numbers[i] = sc.nextInt();
        }

        int sum = 0;
        try {
            for (int i = 0; i <= N; i++) {  
                sum += numbers[i];
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds. Index " + e.getMessage());
        }

        System.out.println("Sum: " + sum);
    }
}
