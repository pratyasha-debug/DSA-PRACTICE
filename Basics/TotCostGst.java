import java.util.*;
import java.util.Scanner;
public class TotCostGst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter pencil value");
        float pencil = sc.nextFloat();
        System.out.println("Enter pen value");
        float pen = sc.nextFloat();
        System.out.println("Enter eraser value");
        float eraser = sc.nextFloat();
        double total = pencil + pen + eraser;
        System.out.println("total without GST:" + " " + String.format("%.2f",total));
        double tot_with_gst = total + 0.18f * total;
        System.out.println("total with GST:" + " " +String.format("%.2f",tot_with_gst));
    }
    
}
