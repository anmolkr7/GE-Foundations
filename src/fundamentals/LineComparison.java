package fundamentals;
import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args){
        System.out.println("Welcome to Line Comparison Computation Program on Master Branch");

        // Scanner for user input
        Scanner sc=new Scanner(System.in);

        // All coordinate variables for both lines
        int x1, y1, x2, y2;
        int a1, b1, a2, b2;

        // Taking input coordinates for line 1
        System.out.println("Enter x1 y1:");
        x1=sc.nextInt();
        y1=sc.nextInt();

        System.out.println("Enter x2 y2:");
        x2=sc.nextInt();
        y2=sc.nextInt();

        //Taking input coordinates for line 2
        System.out.println("Enter a1 b1 for Line 2:");
        a1=sc.nextInt();
        b1=sc.nextInt();

        System.out.println("Enter a2 b2 for Line 2:");
        a2=sc.nextInt();
        b2=sc.nextInt();

        // Calculating distance using formula for both the lines
        double length1=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        double length2=Math.sqrt((a2-a1)*(a2-a1)+(b2-b1)*(b2-b1));

        // Checking equality of two line lengths using equals()
        if(Double.valueOf(length1).equals(length2))
            System.out.println("Both lines are equal in length");
        else
            System.out.println("Lines are not equal in length");
    }
}
