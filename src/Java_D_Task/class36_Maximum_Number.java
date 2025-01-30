package Java_D_Task;

import java.util.Scanner;

public class class36_Maximum_Number {
    public static void main(String[] args) {
        // Input :: user Input as Integer and output as Integer
        // Rough logic : 2 inputs as a and b if a is greater than b the a is the Maximum number and if b is the greater than
        // a then b is the Maximum number if a is equals to b then the numbers are equal

        // Code implementation initializing the interger
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1!");
        int a = sc.nextInt();
        System.out.println("Enter the number 2!");
        int b = sc.nextInt();
        if (a > b) {
            System.out.println(a + " is the Maximum number");
        } else if (a == b) {
            System.out.println(a + " & " + b + " number are Equal");
        } else {
            System.out.println(b + " is the Maximum Number");
        }
        sc.close();
    }
}
