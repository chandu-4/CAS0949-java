import java.util.Arrays;

public class DuplicateZeros {
    public static void duplicateZeros(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            if (arr[i] == 0) {
                for (int j = length - 1; j > i; j--) {
                    arr[j] = arr[j - 1];
                }
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};
        duplicateZeros(arr);
        System.out.println(Arrays.toString(arr));
    }
}
