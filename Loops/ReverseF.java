import java.util.*;
public class ReverseF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int rev =0;
        while(n >0){
            int lastDigit = n%10;
            rev = (rev *10) +lastDigit;
            n /=10;

        }
        System.out.println("Reversed number is " + rev);
    }
    
}
