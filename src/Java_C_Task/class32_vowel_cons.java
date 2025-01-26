package Java_C_Task;

import java.util.Scanner;

public class class32_vowel_cons {
    public static void main(String[] args) {
        int v = 0;
        int c = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String! ");
        String name = sc.next();
        name = name.toLowerCase();

        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'o' || name.charAt(i) == 'u' || name.charAt(i) == 'i') {
                v++;
                char vo = (name.charAt(i));

            } else if (name.charAt(i) >= 'a' && name.charAt(i) <= 'z') {

                c++;
                char co = (name.charAt(i));

            }
        }
        System.out.println("printing vowel as" + v + " in " + name);
        System.out.println("printing consonent as" + c + " in " + name);

    }
}
