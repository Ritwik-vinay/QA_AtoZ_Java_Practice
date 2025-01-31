package Java_D_Task;

import java.util.Scanner;

public class class44_Char_or_Alphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String/Character");
        String letter = sc.next();
        char ch = letter.charAt(0);
        if (Character.isLetter(ch)) {
            System.out.println("Alphabet");
        } else
            System.out.println("Char");
        sc.close();

    }
}
