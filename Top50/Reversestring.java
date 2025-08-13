import java.util.*;
import java.util.Scanner;
public class Reversestring{
    public static String reverseString(String s){
        String reverse = "";
        for(int i = s.length()-1; i >= 0; i --){
            reverse += s.charAt(i);

        }
        return reverse;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String s = sc.next();
        System.out.println(reverseString(s));
    }
}