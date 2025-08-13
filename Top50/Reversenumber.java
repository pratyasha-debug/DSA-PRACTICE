import java.util.*;
public class Reversenumber{
    public static int reverseNum (int n){
        int rev = 0;
        while(n > 0){
            int lastDigit = n %10;
            rev = rev * 10 + lastDigit;
            n = n/10;
        }
        return rev;
        

    }
    public static void main(String[] args) {
        int n = 10245;
        System.out.println(reverseNum(n));
    }

}