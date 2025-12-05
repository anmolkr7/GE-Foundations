package javabasics;

import java.util.Scanner;
public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        //Taking the input from user
        System.out.println("Enter the value of n");
        n=sc.nextInt();
        //Validation check for input n
        if(n>=0 && n<31){
            System.out.println("Valid Input");
            //Printing powers of 2
            for(int i=0;i<=n;i++)
            {
                int pow=(int) Math.pow(2,i);
                System.out.println("2^" + i + " = " + pow);
            }
        }
        else{
            //Out of range so nothing to compute
            System.out.println("Invalid input");
            System.exit(0);
        }
    }
}
