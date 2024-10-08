import java.util.Scanner;
public class ReverseAlphabeticalOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String inputWord = scanner.nextLine();
        char[] charArray = inputWord.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            for (int j = i + 1; j < charArray.length; j++) {
                if (charArray[i] < charArray[j]) {
                    char temp = charArray[i];
                    charArray[i] = charArray[j];
                    charArray[j] = temp;
                }
            }
        }
        String sortedWord = new String(charArray);
        System.out.println("Word arranged in reverse alphabetical order: " + sortedWord);
        scanner.close();
    }
}
