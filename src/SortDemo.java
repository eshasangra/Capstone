

public class SortDemo {

    // Bubble Sort: repeatedly swaps adjacent elements if they are in the wrong order.
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

    // Selection Sort: repeatedly finds the minimum element from the unsorted part and moves it to the beginning.
    public static void selectionSort(int[] array) {
        int n = array.length;
        // One by one move the boundary of the unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Assume the current index is the minimum.
            int minIndex = i;
            // Find the minimum element in the remaining unsorted part.
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the element at the current index.
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    // Helper method to print the array
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Main method to test both sorting algorithms.
    public static void main(String[] args) {
        // Sample array to sort
        int[] originalArray = {64, 34, 25, 12, 22, 11, 90};

        // Clone the original array so each sort gets the unsorted array.
        int[] arrayForBubbleSort = originalArray.clone();
        int[] arrayForSelectionSort = originalArray.clone();

        System.out.println("Original Array:");
        printArray(originalArray);

        // Bubble Sort
        bubbleSort(arrayForBubbleSort);
        System.out.println("Array after Bubble Sort:");
        printArray(arrayForBubbleSort);

        // Selection Sort
        selectionSort(arrayForSelectionSort);
        System.out.println("Array after Selection Sort:");
        printArray(arrayForSelectionSort);
    }
}

