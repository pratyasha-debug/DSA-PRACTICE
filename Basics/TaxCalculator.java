import java.util.*;
import java.util. Scanner;
public class TaxCalculator{
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Salary");
    int salary = sc.nextInt();
    int tax=0;
    if(salary < 500000){
        System.out.println("NO TAX");
    }
    else if(salary >= 500000 && salary <1000000){
        tax = (int)(salary * 0.2);
    }
    else{
        tax = (int)(salary * 0.3);
    }
    System.out.println("your tax is:" + tax);
    System.out.println("Your salary without tax is :" + " " + salary);
    System.out.println("Your salary with tax is :" + " " + (salary + tax));
    sc.close();
 }
}