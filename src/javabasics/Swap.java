package javabasics;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //variables to store the two numbers
        int a,b;

        //Taking input from the user
        System.out.println("Enter the two numbers to swap");
        System.out.println("Enter the first number:");
        a=sc.nextInt();
        System.out.println("Enter the second number:");
        b=sc.nextInt();

        //logic to swap the two numbers
        a=a+b;
        b=a-b;
        a=a-b;

        //Displaying the output after swap
        System.out.println("After Swap");
        System.out.println("First number: "+a);
        System.out.println("Second number: "+b);
    }
}
