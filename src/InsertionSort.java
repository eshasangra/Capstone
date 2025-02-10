
public class InsertionSort {

    // Method to perform insertion sort on the array
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        // Start from the second element (index 1) as the first element is considered sorted
        for (int i = 1; i < n; i++) {
            // The element to be inserted into the sorted portion
            int key = arr[i];
            int j = i - 1;

            // Move elements of arr[0..i-1] that are greater than 'key' one position to the right
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            // Insert the key into its correct location within the sorted portion
            arr[j + 1] = key;
        }
    }

    // Helper method to print the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Main method to test the insertion sort algorithm
    public static void main(String[] args) {
        int[] numbers = {12, 11, 13, 5, 6};
        System.out.println("Original Array:");
        printArray(numbers);

        insertionSort(numbers);

        System.out.println("Sorted Array:");
        printArray(numbers);
    }
}
