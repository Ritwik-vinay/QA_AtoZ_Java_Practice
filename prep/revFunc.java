import java.util.Scanner;

public class revFunc {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String input = scn.nextLine();
        rev(input);

    }


    static String rev(String revstr) {

        StringBuilder sb = new StringBuilder(revstr);

        revstr = sb.reverse().toString();
        System.out.println(revstr);
        return revstr;

    }
}
