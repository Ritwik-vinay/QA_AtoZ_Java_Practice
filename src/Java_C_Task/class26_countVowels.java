package Java_C_Task;

import java.util.Scanner;

public class class26_countVowels {
    public static void main(String[] args) {
        int vowel=0,consonent=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name! ");
        String name = sc.next();
        name = name.toLowerCase();
        for(int i=0;i<name.length();i++) {
            if (name.charAt(i)== 'a'||name.charAt(i)== 'e'||name.charAt(i)== 'i'||name.charAt(i)== 'o'||name.charAt(i)== 'u') {
                vowel++;
            }
            else if(name.charAt(i)>='a' && name.charAt(i)<='z'){
                consonent++;
            }

        }
        System.out.println("Vowel count in the String is" + vowel);
        System.out.println("Consonent count in the string is" + consonent);
    }
}
