package Java_C_Task;

public class class23_Operators {
    public static void main(String[] args) {
        //Write a program to demonstrate the difference
        //between pre-increment and post-increment operators in a loop that counts from 1 to 5.
        //I/o & O/p: int 1 as input and output should be count from 1-5 using pre-increment and post increment
        int i = 1;
        //Pre-increment
        System.out.println(i);
        System.out.println(++i);
        System.out.println(++i);
        System.out.println(++i);
        System.out.println(++i);
        System.out.println("*****************");
        //Post-Increment
        for (i = 1; i <= 5; i++) {
            System.out.print(i);
        }


    }
}
