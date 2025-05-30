import java.util.*;
import java.util.Scanner;
public class SmallestNumber {

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
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        System.out.println("Enter numbers");
        int numbers[] = new int[n];
        for(int i =0;i <n; i++){
          numbers[i] = sc.nextInt();
        }
        int smallestNumber = findSmallest(numbers);

        System.out.println("Smallest number is: " + smallestNumber);
    }
}
