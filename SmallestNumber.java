import java.util.*;
public class SmallestNumber {

    // Function to find the smallest number
    public static int findSmallest(int[] arr) {
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        return smallest;
    }

    public static void main(String[] args) {
        int[] numbers = {12, 56, 7, 89, 34};

        int smallestNumber = findSmallest(numbers);

        System.out.println("Smallest number is: " + smallestNumber);
    }
}
