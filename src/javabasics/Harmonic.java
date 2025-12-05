package javabasics;

import java.util.Scanner;
public class Harmonic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        //Taking the input from user
        System.out.println("Enter the value of N");
        n=sc.nextInt();
        //Stores the sum of the harmonic series
        double sum=1;
        //Input validation as n must be positive
        if(n>0)
        {
            //Printing first term separately for proper formatting
            System.out.print("1/1 + ");
            //Printing and adding terms from 1/2 to 1/n-1
            for(int i=2;i<n;i++)
            {
                System.out.print("1/"+i+"+ ");
                sum=sum+(1.0/i);
            }
            //Adding and printing the last term
            sum=sum+(1.0)/n;
            System.out.println("1/"+n);
            System.out.println("Sum="+sum);
        }
        else {
            System.out.println("Invalid Input");
        }
    }
}
