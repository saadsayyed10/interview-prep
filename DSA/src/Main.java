import arrays.BinarySearch;
import arrays.LinearSearch;

public static void main(String[] args) {
    int[] arr = {10, 50, 160, 222, 323};
    LinearSearch searchLinear = new LinearSearch();
    BinarySearch searchBinary = new BinarySearch();

    int result = searchBinary.binarySearch(arr, 323);
    System.out.println("Element found at index: " + result);
    }

