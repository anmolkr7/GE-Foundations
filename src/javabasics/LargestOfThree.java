package javabasics;
import java.util.Scanner;
public class LargestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Three variables to store the numbers
        int a,b,c;

        //Taking input from the user
        System.out.print("Enter first number: ");
        a=sc.nextInt();

        System.out.print("Enter second number: ");
        b=sc.nextInt();

        System.out.print("Enter third number: ");
        c=sc.nextInt();


        int largest=a;
        if (b>largest) largest=b;
        if (c>largest) largest=c;

        System.out.println("Largest number is: " + largest);
    }
}
