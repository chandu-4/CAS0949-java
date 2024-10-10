import java.util.ArrayList;
import java.util.Collections;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 4, 5};
        int[] arr2 = {2, 4, 6, 8};

        ArrayList<Integer> mergedList = new ArrayList<>();
        for (int num : arr1) {
            mergedList.add(num);
        }
        for (int num : arr2) {
            mergedList.add(num);
        }

        Collections.sort(mergedList);

        int[] arr3 = new int[mergedList.size()];
        for (int i = 0; i < mergedList.size(); i++) {
            arr3[i] = mergedList.get(i);
        }

        System.out.print("Merged array: ");
        for (int num : arr3) {
            System.out.print(num + " ");
        }
    }
}
