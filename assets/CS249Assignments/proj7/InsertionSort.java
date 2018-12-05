
/***********************************************************************************************************************
 *  Use the sorting pattern to implement insertion sort. In insertion sort, the split method always returns
 *  the value (end — 1) . This results in splitting the array into two pieces, one with a single value at the
 *  end of the array, and the other with everything else. The join method does more work. A precondition for
 *  entry into join is that the elements from a[begin] to a[end-1] will be in sorted order. The method should
 *  insert a[end] into the correct spot from a[begin] to a[end] such that sorted order is maintained. For
 *  example, if array a contains {2, 4, 6, 8, 5} where begin = 0 and end = 4 then a[end] = 5 and the method
 *  should insert the value 5 between the 4 and 6, resulting in {2, 4, 5, 6, 8} . This entails copying the 6
 *  and 8 one element to the right, and then copying the value 5 to index 2.
 * 
 * CS249 with Spetka
 * October 2018
 * Language: Java (javac target)
***********************************************************************************************************************/
import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int genesis[] = new int[10];
        populateArray(genesis);
        System.out.println("Before Sorting: ");
        printArray(genesis);
        insertionSort(genesis);
        System.out.println("\nAfter Sorting: ");
        printArray(genesis);
    }

    private static void insertionSort(int[] toSort) {
        for (int i = 0; i < toSort.length; i++) {
            int sortME = toSort[i];
            int j = i;
            while (j > 0 && toSort[j - 1] > sortME) {
                toSort[j] = toSort[j - 1];
                j--;
            }
            toSort[j] = sortME;
        }
    }

    public static void printArray(int[] display) {
        System.out.println(Arrays.toString(display));
    }

    public static void populateArray(int[] populate) {
        for (int i = 0; i < populate.length; i++) {
            populate[i] = (int) (Math.random() * 100);
        }
    }
}
