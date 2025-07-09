import java.util.*;
public class Continue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num");
        int n = sc.nextInt();
        for(int i =1; i <=n; i++){
            if(i%2 == 0){
                continue;
            }
            System.out.println(i);

        }
        System.out.println("Out of loop");
    }
    
}
