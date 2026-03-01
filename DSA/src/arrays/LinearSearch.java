package arrays;

public class LinearSearch {

    /**
     * Searches for a target value in an integer array using linear search.
     * Scans each element one by one from left to right until the target is found.
     *
     * @param arr    - the integer array to search through
     * @param target - the value to search for
     * @return a message stating the target's index if found, otherwise a not found message
     */
    public String linearSearch(int[] arr, int target) {

        // Iterate through every element in the array from left to right
        for (int i = 0; i < arr.length; i++) {

            // Check if the current element matches the target
            if (arr[i] == target) {
                return "Target element: " + target + ", found at index: " + i;
            }
        }

        // Target was not found after scanning the entire array
        return "Target element: " + target + " not found";
    }
}