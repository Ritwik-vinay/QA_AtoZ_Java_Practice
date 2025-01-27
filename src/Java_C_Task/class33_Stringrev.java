package Java_C_Task;

import java.util.Scanner;

public class class33_Stringrev {
    public static void main(String[] args) {
        String name = "";
        String rev = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String!");
        name = sc.next();


        for (int i = name.length() - 1; i >= 0; i--) {
            rev = rev + name.charAt(i);


        }
        System.out.println(rev);


    }
}
