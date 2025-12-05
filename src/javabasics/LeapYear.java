package javabasics;

import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year");
        //Year is denoted as y
        int y=sc.nextInt();
        //Validation check for the input year range as it must be 4 digit
        if(y>999 && y<10000){
            System.out.println("Year is valid");
            //Year if divisible by 4 is a leap year
            if(y%4==0){
                System.out.println("Leap year");
            }
            else{
                System.out.println("Not a leap year");
            }
        }
        else {
            System.out.println("Invalid Input Year");
        }
    }
}
