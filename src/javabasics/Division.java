package javabasics;
import java.util.Scanner;
public class Division {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //Taking the input from user
        System.out.println("Enter the dividend");
        int dividend=sc.nextInt();
        System.out.println("Enter the divisor");
        int divisor=sc.nextInt();

        //Computing the quotient and remainder
        int quotient=dividend/divisor;
        int remainder=dividend%divisor;

        //Displaying the output
        System.out.println("Quotient: "+quotient);
        System.out.println("Remainder: "+remainder);


    }
}
