import java.util.*;
import java.math.BigInteger;
public class Fact{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a range");
        int num = sc.nextInt();
        if(num <0){
            System.out.println("Factorial is not for -ve");
        }
        else{
            BigInteger fact = BigInteger.ONE;
            for(int i =1; i<=num;i++){
                fact = fact.multiply(BigInteger.valueOf(i));
            }
            System.out.println("factorial:" + fact);

        }
    }
}