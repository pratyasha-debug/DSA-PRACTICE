import java.util.*;
import java.util.Scanner;

public class inputoutput {
    public static void main (String args[]){
        int marks[] = new int[100];
       float total =600;
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name =  sc.nextLine();
        System.out.println("Enter phy marks");
        marks[0] = sc.nextInt();
        System.out.println("Enter chem marks");
        marks[1] = sc.nextInt();
        System.out.println("Enter math marks");
        marks[2] = sc.nextInt();
        System.out.println("Enter Biology marks");
        marks[3] = sc.nextInt();
        System.out.println("Enter IT marks");
        marks[4] = sc.nextInt();
        System.out.println("Enter English marks");
        marks[5] = sc.nextInt();
        int sum =0;
        for(int i =0; i <6;i++){
            sum += marks[i];
        }
        float percentage = (sum / total) * 100;
        
        if (percentage >=60){
            System.out.println( "congrats" +" "+ name + " " +"You got first divison with " + " " + String.format("%.2f", percentage + "%."));

        }
        else if(percentage <60  && percentage >=40){
            System.out.println( "Try your best" +" "+ name + " " +"You got second divison with " + " " + String.format("%.2f", percentage) + "%.");

            
        }
        else if(percentage <40  && percentage >=30){
            System.out.println( "Try more to improve" +" "+ name + " " +"You got third divison with " + " " + String.format("%.2f",percentage) + "%");

        }
        else{
            System.out.println( "Better luck next time" +" "+ name + " " +"You got failed with " + " " + String.format("%.2f",percentage) + "%");
        }
        


    }
}
