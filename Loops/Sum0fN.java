import java.util.*;
public class Sum0fN {
    public static void main(String[] args) {
        int sum =0;
        int counter =1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a  number");
        int range = sc.nextInt();
        while(counter<= range){
            sum += counter;
            counter++;
        }
        System.out.println(sum + " ");

    }
    
}
