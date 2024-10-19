import java.util.Arrays;

class GenericSorter<T extends Comparable<T>> {
    private T[] array;

    public GenericSorter(T[] array) {
        this.array = array;
    }

    public void sort() {
        Arrays.sort(array);
    }

    public void printArray() {
        for (T element : array) {
            System.out.println(element);
        }
    }
}

public class GenericSortExample {
    public static void main(String[] args) {
        Integer[] intArray = {5, 2, 9, 1, 5, 6};
        String[] strArray = {"Banana", "Apple", "Peach", "Orange"};

        GenericSorter<Integer> intSorter = new GenericSorter<>(intArray);
        GenericSorter<String> strSorter = new GenericSorter<>(strArray);

        System.out.println("Sorted Integer Array:");
        intSorter.sort();
        intSorter.printArray();

        System.out.println("\nSorted String Array:");
        strSorter.sort();
        strSorter.printArray();
    }
}
