package fundamentals;
import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args){
        System.out.println("Welcome to Line Comparison Computation Program on Master Branch");

        // Scanner for user input
        Scanner sc=new Scanner(System.in);

        // All coordinate variables
        int x1, y1, x2, y2;

        // Taking first point input
        System.out.println("Enter x1 y1:");
        x1=sc.nextInt();
        y1=sc.nextInt();

        // Taking second point input
        System.out.println("Enter x2 y2:");
        x2=sc.nextInt();
        y2=sc.nextInt();

        // Calculating distance using formula
        double length=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));

        // Displaying the final computed length
        System.out.println("Length of the Line="+length);
    }
}
