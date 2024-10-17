import java.util.Scanner;

public class SkipNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the value of M:");
        int M = scanner.nextInt();
        
        System.out.println("Enter the value of N:");
        int N = scanner.nextInt();
        
        System.out.println("Enter the value of K (numbers to skip):");
        int K = scanner.nextInt();
        
        for (int i = M; i <= N; i += (K + 1)) {
            System.out.print(i + " ");
        }
        
        scanner.close();
    }
}
