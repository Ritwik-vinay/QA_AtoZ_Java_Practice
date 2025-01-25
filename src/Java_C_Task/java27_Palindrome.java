package Java_C_Task;

import java.util.Scanner;

public class java27_Palindrome {
    public static void main(String[] args) {
        String revName="", oName ="";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name!!");
        oName = sc.nextLine();
        int len = oName.length();

        for (int i=len-1; i>= 0; i--) {
            revName = revName + oName.charAt(i);
        }
            if(oName.equalsIgnoreCase(revName)){
                System.out.println(oName +" It is a Palindrome");
            }
            else {
                System.out.println(revName + " It is not a Palindrome");
            }

        }
    }

