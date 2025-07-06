import java.util.*;
public class TempCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature");
        double temp = sc.nextDouble();
        if(temp>100){
            System.out.printf("You have fever and your temperature is %.2f" , temp);
        }
        else{
            System.out.printf("You dont have fever because your temperature is %.2f", temp);
        }
    }
    
}
