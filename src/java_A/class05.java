package java_A;

import java.util.Scanner;

public class class05 {
    public static void main(String[] args) {
        //Write a program that calculates and displays the letter grade for a given numerical score
        //  (e.g., A, B, C, D, or F) based on the following grading scale:
        //A: 90-100
        //B: 80-89
        //C: 70-79
        //D: 60-69
        //F: 0-59
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Marks");
        int marks= scn.nextInt();
        if (marks>=90 && marks<=100){
            System.out.println("Grade = A");
        } else if (marks>=80 && marks<=89) {
            System.out.println("Grade = B");
        } else if (marks>=70 && marks<=79) {
            System.out.println("Grade = C");
        } else if (marks>=60 && marks<=69) {
            System.out.println("Grade = D");
        }
        else {
            System.out.println("Grade = F");
        }

    }
}
