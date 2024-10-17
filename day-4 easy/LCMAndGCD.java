import java.util.Scanner;

public class LCMAndGCD {
    
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
    
    public static int findGCD(int[] arr, int n) {
        int result = arr[0];
        for (int i = 1; i < n; i++) {
            result = gcd(result, arr[i]);
            if (result == 1) {
                return 1;
            }
        }
        return result;
    }
    
    public static int findLCM(int[] arr, int n) {
        int result = arr[0];
        for (int i = 1; i < n; i++) {
            result = lcm(result, arr[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the number of elements:");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        int gcd = findGCD(arr, n);
        int lcm = findLCM(arr, n);
        
        System.out.println("GCD of the numbers is: " + gcd);
        System.out.println("LCM of the numbers is: " + lcm);
        
        scanner.close();
    }
}
