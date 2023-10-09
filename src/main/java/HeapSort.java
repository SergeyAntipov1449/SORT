public class HeapSort {

    public static void heapSort(int[] array) {
        for (int i = array.length / 2 - 1; i >= 0; i--) {
            heapify(array, i, array.length);
        }
        for (int i = array.length - 1; i >= 0; i--) {
            int temp = array[i];
            array[i] = array[0];
            array[0] = temp;

            heapify(array, 0, i);
        }
    }

    private static void heapify(int[] array, int root, int size) {
        int r = root * 2 + 2;
        int l = root * 2 + 1;
        int largest = root;

        if (l < size && array[l] > array[largest]) {
            largest = l;
        }
        if (r < size && array[r] > array[largest]) {
            largest = r;
        }
        if (root != largest) {
            int temp = array[root];
            array[root] = array[largest];
            array[largest] = temp;

            heapify(array, largest, size);
        }
    }
}
