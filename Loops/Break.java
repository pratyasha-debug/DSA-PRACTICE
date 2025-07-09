import java.util.*;
public class Break {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a range");
        int n = sc.nextInt();
        for(int i = 1; i <=n; i++){
            if(i == 7){
                break;
            }
            System.out.println(i);
        }
        System.out.println("I m out of loop");
    }
    
}
