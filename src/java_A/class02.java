package java_A;

import java.util.Scanner;

public class class02 {
    public static void main(String[] args) {
        //Print  lines of output; each line  (where ) contains the  of  in the form:
        //N x i = result.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");

        int n= sc.nextInt();
        int i =0;
        System.out.println("Table of "+n);
        for(i=1;i<=10;i++){

            System.out.println(n +" x "+ i +" = "+ n*i);

        }

        System.out.println("Reverse Table of "+ n);
        for(i=10;i>=1;i--){
            System.out.println(n +" x "+ i +" = "+ n*i);
        }


    }
}
