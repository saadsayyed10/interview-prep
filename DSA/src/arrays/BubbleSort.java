package arrays;

public class BubbleSort {

    /**
     * Sorts an integer array in ascending order using the bubble sort algorithm.
     * Repeatedly compares adjacent elements and swaps them if they are in the wrong order.
     *
     * @param arr - the integer array to be sorted (modified in place)
     */
    public void bubbleSort(int[] arr) {
        int n = arr.length;

        // Outer loop: each pass guarantees the largest unsorted element
        // "bubbles up" to its correct position at the end of the array
        for (int i = 0; i < n - 1; i++) {

            // Inner loop: traverse the unsorted portion of the array.
            // Upper bound shrinks by i each pass since the last i elements
            // are already sorted and don't need to be compared again
            for (int j = 0; j < n - i - 1; j++) {

                // Swap adjacent elements if they are in the wrong order
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];      // Store the larger element temporarily
                    arr[j] = arr[j + 1];    // Move the smaller element to the left
                    arr[j + 1] = temp;      // Place the larger element to the right
                }
            }
        }
    }
}