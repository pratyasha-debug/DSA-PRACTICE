import java.util.*;
import java.util.Scanner;
public class TernaryOp {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter value one");  
      int a = sc.nextInt();
      System.out.println("Enter value two");  
      int b = sc.nextInt();
      boolean larger = (a > b)? true: false;
      System.out.println(larger);
      System.out.println("Enter value ");  
      int num= sc.nextInt();
      String type = (num %2 ==0)? "even" : "odd";
      System.out.println(type);
      System.out.println("Enter marks");
      int marks = sc.nextInt();
      String reportCard = (marks >= 33)? "PASS":"FAIL";
      System.out.println(reportCard);
    }
}
