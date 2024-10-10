import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniquePermutations {
    public static void generatePermutations(String str, int left, int right, Set<String> permutations) {
        if (left == right) {
            permutations.add(str); 
        } else {
            for (int i = left; i <= right; i++) {
                str = swap(str, left, i);  
                generatePermutations(str, left + 1, right, permutations);
                str = swap(str, left, i);  
            }
        }
    }

    public static String swap(String str, int i, int j) {
        char[] charArray = str.toCharArray();
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return new String(charArray);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String number = scanner.nextLine();

        Set<String> permutations = new HashSet<>();  

        generatePermutations(number, 0, number.length() - 1, permutations);

        System.out.println("Unique permutations of " + number + " are:");
        for (String perm : permutations) {
            System.out.println(perm);
        }

        scanner.close();
    }
}
