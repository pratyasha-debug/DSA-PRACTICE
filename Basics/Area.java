import java.util.*;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.println("Enter radius");
    float r = sc.nextFloat();
    float area = 3.14f *r*r;
   System.out.println( "area of circle is" + " " +  String.format("%.2f",area));
        
    }
    
    


}
