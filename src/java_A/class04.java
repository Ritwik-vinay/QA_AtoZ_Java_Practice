package java_A;

import java.util.Scanner;

public class class04 {
    public static void main(String[] args) {
        //Create a program that checks whether a given string is a palindrome.
        // A palindrome is a word or phrase that reads the same backward as forward
        // (ignoring spaces, punctuation, and capitalization).
        // Use an if-else statement to determine if the string is a palindrome.
        String original, reverse ="";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        original= sc.nextLine();
        int len=original.length();
        for (int i=len-1;i>=0;i--){
            reverse= reverse+original.charAt(i);
        }
        if (original.equalsIgnoreCase(reverse)){
            System.out.println(original + " is a Pelindrome");
        }
        else
            System.out.println(reverse + " is not a Pelindrome");


    }
}
