package arrays;

public class LinearSearch {
    public String linearSearch(int[] arr, int target) {
        for (int i = 0; i < target; i++) {
            if(arr[i] == target) {
                return "Target element: " + target + ", found at index: " + i;
            }
        }
        return "Target element: " + target + " not found";
    }
}
