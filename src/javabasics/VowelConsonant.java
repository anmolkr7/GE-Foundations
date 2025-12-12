package javabasics;
import java.util.Scanner;
public class VowelConsonant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //Taking input from the user using Scanner
        System.out.print("Enter an alphabet: ");
        char ch=sc.next().toLowerCase().charAt(0);

        //if character matches with aeiou then it is a vowel
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            System.out.println(ch+" is a Vowel");
        else
            System.out.println(ch+" is a Consonant");
    }
}
