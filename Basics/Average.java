import java.util.Scanner;
import java.util.*;
public class Average {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        float avg = (a+b+c)/3;
        System.out.println("The average of 3 number is" + String.format("%.2f",avg));


    }
    
}
