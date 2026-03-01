import arrays.LinearSearch;

public static void main(String[] args) {
    int[] arr = {2, 10, 50, 60};
    LinearSearch searchLinear = new LinearSearch();

    String result = searchLinear.linearSearch(arr, 50);
    System.out.println(result);
    }

