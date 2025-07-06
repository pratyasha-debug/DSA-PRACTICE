import java.util.*;
import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        switch(number){
           case 1:System.out.println("Momos");
           break;
           case 2: System.out.println("LUSSI");
           break;
           case 3: System.out.println("ICE CREAM");
           break;
           default:System.out.println("We are wake up");
        }
        
    }
}
