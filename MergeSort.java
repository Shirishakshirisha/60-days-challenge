Time Complexity: O(n log n) in the best, average, and worst cases. This reflects the algorithm's efficiency in dividing the array and merging the sorted subarrays.
Space Complexity: O(n) due to the use of temporary arrays for merging and additional space required for the recursive stack.
public class MergeSort {

    // Function to merge two sorted arrays
    public static void merge(int[] array, int[] left, int[] right) {
        int i = 0; // Pointer for left array
        int j = 0; // Pointer for right array
        int k = 0; // Pointer for merged array

        // Merge the two arrays
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }

        // Copy remaining elements from left array, if any
        while (i < left.length) {
            array[k++] = left[i++];
        }

        // Copy remaining elements from right array, if any
        while (j < right.length) {
            array[k++] = right[j++];
        }
    }

    // Merge Sort Function
    public static void mergeSort(int[] array) {
        if (array.length < 2) {
            return; // Base case: array is already sorted
        }
        int mid = array.length / 2;
        int[] left = new int[mid];
        int[] right = new int[array.length - mid];

        // Copy data to temp arrays
        System.arraycopy(array, 0, left, 0, mid);
        System.arraycopy(array, mid, right, 0, array.length - mid);

        // Recursively sort the two halves
        mergeSort(left);
        mergeSort(right);

        // Merge the sorted halves
        merge(array, left, right);
    }

    // Main method to test the merge sort
    public static void main(String[] args) {
        int[] array = {5, 4, 6, 8, 2, 9};
        System.out.println("Given Array:");
        printArray(array);

        mergeSort(array);

        System.out.println("Sorted Array:");
        printArray(array);
    }

    // Utility function to print an array
    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
