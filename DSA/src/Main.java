import arrays.BinarySearch;
import arrays.BubbleSort;
import arrays.LinearSearch;

public static void main(String[] args) {
    int[] unsortedArr = {5, 3, 8, 1, 2};
    LinearSearch searchLinear = new LinearSearch();
    BinarySearch searchBinary = new BinarySearch();

    BubbleSort sortBubble = new BubbleSort();
    printArray(unsortedArr);

    sortBubble.bubbleSort(unsortedArr);
    printArray(unsortedArr);

    }

private static void printArray(int[] arr) {
    for (int num : arr) {
        System.out.print(num + " ");
    }
    System.out.println();
}
