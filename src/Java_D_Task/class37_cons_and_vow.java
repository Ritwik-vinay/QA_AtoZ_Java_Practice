package Java_D_Task;

import java.util.Scanner;

public class class37_cons_and_vow {
    public static void main(String[] args) {
        // input : character output : String
        // logic if the character is equals to a,e,i,o,u then its a vowel or the character is Consonent
        // Code Implementation


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Character!");
        char character = sc.next().charAt(0);
        if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
            System.out.println(character + " is Vowel");
        } else {
            System.out.println(character + " is consonent");
        }
    }
}
