import java.util.*;
import java.util.Scanner;
public class AreaSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter edge size:");
        float side = sc.nextFloat();
        float area = side * side;
        System.out.println("area of square is :" + " " + String.format("%.2f",area));
    }
    
}
