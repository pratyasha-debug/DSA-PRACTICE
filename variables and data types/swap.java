import java.util.*;
public class swap {
    public static void main (String args[]){
        int a =10;
        int b =5;
        System.out.println("Before swapping the original value of a=" +a +"The value of b=" +b);
        a= a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping the value is a is" + " " + a + " " +"b is" + " "  + " " + b);
    }
    
}
