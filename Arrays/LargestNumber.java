import java.util.*;
import java.util.Scanner;
public class LargestNumber {
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
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = sc.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter" +" " + n + " " + "elements");
        for(int i =0; i < n; i ++){
            numbers[i] = sc.nextInt();

        }

        int largestNumber = findLargest(numbers);

        System.out.println("Largest number is: " + largestNumber);
    }
}
