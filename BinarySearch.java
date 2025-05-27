import java.util.Arrays;  
import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

          
            if (arr[mid] == key) {
                return mid;  
            }
        
            else if (arr[mid] < key) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }

        return -1;  
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = {2, 4, 6, 8, 10, 12, 14, 16};
        System.out.println(Arrays.toString(numbers));

        System.out.print("Enter number to search: ");
        int key = sc.nextInt();
        int result = binarySearch(numbers, key);

        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + result);
        }

        sc.close();
    }
}
