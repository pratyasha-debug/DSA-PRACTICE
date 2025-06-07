import java.util.*;
import java.util. Scanner;
public class LargestNo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value");
        int a = sc.nextInt();
        System.out.println("Enter b value");
        int b = sc.nextInt();
        System.out.println("Enter c value");
        int c = sc.nextInt();
        if(a>b && a>c){
            System.out.println(a + " " + "is greatest");
        }
        else if(b>a && b >c){
            System.out.println(b + " " + "is greatest");
        }
        else{
            System.out.println(c + " " + "is greatest");
        }
    }
}