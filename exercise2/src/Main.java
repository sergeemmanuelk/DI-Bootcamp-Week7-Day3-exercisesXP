import java.util.Arrays;

/**
 * @author KONANS26
 */
public class Main {
    public static void main(String[] args) {
        Integer[] numArray = {9, 1, 6, 8, 3, 5, 2};
        System.out.println("Unsorted array: " + Arrays.toString(numArray));
        selectionSort(numArray);
        System.out.println("Sorted array: " + Arrays.toString(numArray));
    }

    /**
     *
     * @param numArray
     * @param <T>
     * Java Generics Bounded Type Parameters (<T extends Comparable<T>>)
     */
    public static <T extends Comparable<T>> void selectionSort(T[] numArray) {
        int n = numArray.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (numArray[j].compareTo(numArray[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            T temp = numArray[minIndex];
            numArray[minIndex] = numArray[i];
            numArray[i] = temp;
        }
    }
}