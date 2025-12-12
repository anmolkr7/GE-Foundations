package javabasics;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;

        //Taking the input from the user
        System.out.println("Enter the number to check for Even or Odd");
        n=sc.nextInt();

        //If divisible by 2 then number is even else odd
        if(n%2==0)
            System.out.println(+n+" is Even");
        else
            System.out.println(+n+" is Odd");
    }
}
