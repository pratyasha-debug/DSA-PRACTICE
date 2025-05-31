import java.util.*;
import java.util. Scanner;
public class Adult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        System.out.println("Enter your age:");
       int age= sc.nextInt();
       if(age >= 18 ){
        System.out.println(name + " " + "You are eligible to vote");
       }
       else if(age >= 13 && age <=19 ){
        System.out.println(name + " " + "You are on your teenage");
       }
       else{
        System.out.println(name + " " + "You are not a adult");
       }
        
    }
    
}
