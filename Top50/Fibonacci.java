import java.util.Scanner;
public class Fibonacci {
    public static void fibonacci(int n){
        int first =0, second =1;
        System.out.print(first + " " + second + " ");
        for(int i =3; i <=n; i++){
            int next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter a range");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       fibonacci(n);
       
    }
}
