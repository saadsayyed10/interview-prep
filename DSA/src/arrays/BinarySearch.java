package arrays;

public class BinarySearch {

    /**
     * Searches for a target value in a sorted integer array using binary search.
     *
     * @param arr    - a sorted integer array to search through
     * @param target - the value to search for
     * @return the index of the target if found, otherwise -1
     */
    public int binarySearch(int[] arr, int target) {

        // Initialize the search boundaries to the full extent of the array
        int left = 0;
        int right = arr.length - 1;

        // Continue searching while the search space is valid
        while (left <= right) {

            // Calculate mid using this formula instead of (left + right) / 2
            // to prevent integer overflow when left and right are large values
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;                 // Target found, return its index

            } else if (arr[mid] < target) {
                left = mid + 1;             // Target is in the right half, discard left

            } else {
                right = mid - 1;            // Target is in the left half, discard right
            }
        }

        // Target was not found in the array
        return -1;
    }
}