package arrays;

public class SelectionSort {

    /**
     * Sorts an integer array in ascending order using the selection sort algorithm.
     * Repeatedly selects the smallest element from the unsorted portion and
     * moves it to the end of the sorted portion.
     *
     * @param arr - the integer array to be sorted (modified in place)
     */
    public void selectionSort(int[] arr) {
        int n = arr.length;

        // Outer loop: represents the boundary between the sorted (left)
        // and unsorted (right) portions of the array. Advances by one
        // each pass as the sorted portion grows.
        for (int i = 0; i < n - 1; i++) {

            // Assume the first element of the unsorted portion is the smallest
            int minIdx = i;

            // Inner loop: scan the unsorted portion to find the actual minimum element
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;     // Update minIdx whenever a smaller element is found
                }
            }

            // Swap the found minimum element with the first element of the unsorted portion,
            // placing it at the correct position in the sorted portion
            int temp = arr[minIdx];     // Temporarily store the minimum element
            arr[minIdx] = arr[i];       // Move the displaced element to where the minimum was
            arr[i] = temp;              // Place the minimum at the sorted boundary
        }
    }
}