package javabasics;
import java.util.Scanner;

public class FlipCoins {
    public static void main(String[] args) {
        // Denoting number of flips by n
        // Declared the variable. Created in the memory, but we have not assigned any value to it.
        Scanner sc=new Scanner(System.in);
        int n;
        //We denote t for tails
        int t=0;
        //We denote h for heads
        int h=0;

        //Taking input from the user
        System.out.println("Enter the number of flips");
        n=sc.nextInt();

        //Applying the validation check
        if(n>=0)
        {
            System.out.println("Entered number is positive");
        }
        else {
            System.out.println("Entered number is not positive. Terminating the application.");
            System.exit(0);
        }

        //Core logic to count the number of head and number of tails each time
        for(int i = 1; i <= n; i++) {
            double generate=Math.random();
            System.out.println(generate);
            if(generate<0.5) {
                t++;
            }
            else {
                h++;
            }
        }
        //Printing the number of tails and number of heads
        System.out.println("Number of tails="+t);
        System.out.println("Number of heads="+h);

        //Denoting the percentage of heads obtained as headsPercent
        double headsPercent = ((double)h / n) * 100;
        //Denoting the percentage of tails obtained as tailsPercent
        double tailsPercent = ((double)t / n) * 100;

        //Displaying the output
        System.out.println("Heads Percentage: " + headsPercent + "%");
        System.out.println("Tails Percentage: " + tailsPercent + "%");

    }
}