import java.util.Scanner;

public class EvenSumFibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the value of N:");
        int N = scanner.nextInt();
        
        int first = 0, second = 1, evenSum = 0;
        
        while (first <= N) {
            if (first % 2 == 0) {
                evenSum += first;
            }
            int next = first + second;
            first = second;
            second = next;
        }
        
        System.out.println("Even sum of Fibonacci series till " + N + " is: " + evenSum);
        
        scanner.close();
    }
}
