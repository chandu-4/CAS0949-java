import java.util.Scanner;

public class CompositeNumbers {

    public static boolean isComposite(int num) {
        if (num < 4) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the value of a:");
        int a = scanner.nextInt();
        
        System.out.println("Enter the value of b:");
        int b = scanner.nextInt();
        
        System.out.println("Composite numbers between " + a + " and " + b + ":");
        for (int i = a; i <= b; i++) {
            if (isComposite(i)) {
                System.out.print(i + " ");
            }
        }
        
        scanner.close();
    }
}
