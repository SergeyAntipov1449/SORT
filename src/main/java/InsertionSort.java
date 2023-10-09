public class InsertionSort {
    public static void insertionSort(int array[]) {
        int n = array.length;
        for (int i = 1; i < n; ++i) {
            int current = array[i];
            int j = i;

            /* Move elements of array[0..i-1], that are greater than key, to one position ahead
               of their current position */
            while (j > 0 && array[j] > current) {
                array[j] = array[j - 1];
                j++;
            }
            array[j] = current;
        }
    }
}
