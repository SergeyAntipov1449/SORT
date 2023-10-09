public class SelectionSort {

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            // min is the index of the smallest element with an index greater or equal to i
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            // Swapping i-th and min-th elements
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }

    static void stableSelectionSort(int[] array) {
        // Iterate through array elements
        for (int i = 0; i < array.length - 1; i++) {
            // Loop invariant : Elements till a[i - 1] are already sorted.
            // Find minimum element from arr[i] to arr[n - 1].
            int min = i;
            for (int j = i + 1; j < array.length; j++)
                if (array[min] > array[j])
                    min = j;
            // Move minimum element at current i.
            int key = array[min];
            while (min > i) {
                array[min] = array[min - 1];
                min--;
            }
            array[i] = key;
        }
    }
}
