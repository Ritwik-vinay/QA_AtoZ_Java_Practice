package java_A;

public class class03 {
    public static void main(String[] args) {
        //Write a program that prints numbers from 1 to 100.--1
        int i =0;
        for(i=1;i<=100;i++)
            //"For numbers that are multiples of both 3 and 5, print "FizzBuzz."
            {
            if(i%3==0 &&i%5==0){
                System.out.println("FizzBuzz");
            }
            //However, for multiples of 3, print "Fizz" instead of the number,
            else if (i%3==0) {
                System.out.println("Fizz");
            }
            //and for multiples of 5,  print "Buzz.
            else if (i%5==0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }
    }
}
