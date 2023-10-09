public class BubbleSort {
    public static void bubbleSort(int[] array) {
        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = false;
                }
            }
        }
    }

    public static void bubbleSortRec(int[] array, int lenght) {
        if (lenght == 1) {
            return;
        }
        int count = 0;
        // One pass of bubble sort. After this pass, the largest element is moved (or bubbled) to end.
        for (int i = 0; i < lenght - 1; i++) {
            if (array[i] > array[i + 1]) {
                // swap array[i], array[i+1]
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
                count = count + 1;
            }
        }
        // Check if any recursion happens or not If any recursion is not happen then return
        if (count == 0) {
            return;
        }
        // Largest element is fixed, recur for remaining array
        bubbleSortRec(array, lenght - 1);
    }
}
