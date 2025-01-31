package Java_D_Task;

import java.util.Scanner;

public class class43_gradeCalculator {
    public static void main(String[] args) {
        //10) Calculate Grade Based on Marks. (Follow Below Steps to Write Program.)
        //1️⃣ Take user input for marks (Use Scanner class).
        //2️⃣ Check the validity of marks (ensure they are between 0 and 100).
        //3️⃣ Use if-else-if conditions to determine the grade based on marks.
        //4️⃣ Display the grade as output.Marks Range Grade
        //90 - 100   A+
        //80 - 89     A
        //70 - 79      B
        //60 - 69     C
        //50 - 59      D
        //40 - 49      E
        //Below 40   Fail

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Grade!");
        int grade = sc.nextInt();
        while (grade >= 0 && grade <= 100) {
            if (grade >= 90 && grade <= 100) {
                System.out.println(grade + " A+");
            } else if (grade >= 80 && grade <= 89) {
                System.out.println(grade + " A");
            } else if (grade >= 70 && grade <= 79) {
                System.out.println(grade + " B");
            } else if (grade >= 60 && grade <= 69) {
                System.out.println(grade + " C");
            } else if (grade >= 50 && grade <= 59) {
                System.out.println(grade + " D");
            } else if (grade >= 40 && grade <= 49) {
                System.out.println(grade + " E");
            } else {
                System.out.println(grade + " FAIL");
            }
            break;
        }
        sc.close();

    }
}
