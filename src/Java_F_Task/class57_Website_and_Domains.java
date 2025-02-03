package Java_F_Task;

import java.util.Scanner;

public class class57_Website_and_Domains {
    public static void main(String[] args) {
        //Java Program to Determine Website Type Based on Domain
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Website");
        String url = sc.nextLine();
        String domain = url.substring(url.lastIndexOf('.') + 1);
        switch (domain.toLowerCase()) {
            case "com":
                System.out.println("Commercial website");
                break;
            case "org":
                System.out.println("Non-profit organization");
                break;
            case "edu":
                System.out.println("Educational institution");
                break;
            case "gov":
                System.out.println("Government website");
                break;
            case "net":
                System.out.println("Network-related website");
                break;
            case "info":
                System.out.println("Informational website");
                break;
            case "in":
                System.out.println("country code top-level domain ");
                break;
            default:
                System.out.println("The website type is: Unknown or other types of websites");
                break;
        }
        sc.close();

    }
}
