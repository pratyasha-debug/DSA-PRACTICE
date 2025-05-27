// LargestNumber.java

public class  findLargest {

    // Function to find largest number
    public static int findLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        return largest;
    }

    public static void main(String[] args) {
        int[] numbers = {12, 56, 7, 89, 34};

        int largestNumber = findLargest(numbers);

        System.out.println("Largest number is: " + largestNumber);
    }
}
