import java.util.Arrays;
public class ReverseArray {
    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
           while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("Original Array: " + Arrays.toString(numbers));
        reverseArray(numbers);
        System.out.println("Reversed Array: " + Arrays.toString(numbers));
    }
}
