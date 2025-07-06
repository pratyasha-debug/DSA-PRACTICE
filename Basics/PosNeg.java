import java.util.*;

public class PosNeg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        if(n>0){
            System.out.println("It is a possitive no.");
        }
        else if(n<0){
            System.out.println("It is a negative no.");
        }
        else{
            System.out.println("it is neither positive nor negative,it's null");
        }
    }

    
}
