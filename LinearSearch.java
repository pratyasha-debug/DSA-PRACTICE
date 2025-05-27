public class LinearSearch {
    // Method to perform linear search on array
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // target found at index i
            }
        }
        return -1; // target not found
    }

    public static void main(String[] args) {
        int[] nums = {4, 2, 7, 1, 9, 5};
        int target = 7;

        int result = linearSearch(nums, target);

        if (result == -1) {
            System.out.println(target + " not found in the array.");
        } else {
            System.out.println(target + " found at index " + result);
        }
    }
}
