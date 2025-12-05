package javabasics;

import java.util.Scanner;
public class PrimeFactorization {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Taking input from the user
        System.out.println("Enter the number");
        int n=sc.nextInt();
        //Validation check as prime factorization works only for numbers > 1
        if (n<=1){
            System.out.println("Invalid Input");
            System.exit(0);
        }
        System.out.print("Prime Factors: ");
        //Trying all possible factors starting from 2
        for (int i=2;i*i<=n;i++) {
            //Keep dividing while i is a factor
            while (n%i==0) {
                System.out.print(i+" ");
                n/=i;
            }
        }
        // If something>1 is left, it's a prime factor
        if (n>1) {
            System.out.print(n);
        }
    }
}
