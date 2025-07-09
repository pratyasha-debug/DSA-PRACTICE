import java.util.*;
public class RevDo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int rev = 0;
        do{
            int lastDigit = n%10;
            rev = (rev *10)+lastDigit;
            n/=10;
        }
        while(n >0);
        System.out.println("Reversed number is" + " " + rev);
    }
    
}
