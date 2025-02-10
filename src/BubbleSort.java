public class BubbleSort {
    public static void bubbleSort(int[] array) {
        int n = array.length;
        // Outer loop for each pass through the array
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            // Inner loop for comparing adjacent elements
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap adjacent elements
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no two elements were swapped in the inner loop, the array is sorted.
            if (!swapped) {
                break;
            }
        }
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] originalArray = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Original Array:");
        printArray(originalArray);

        bubbleSort(originalArray);
        System.out.println("Array after Bubble Sort:");
        printArray(originalArray);

    }
}
