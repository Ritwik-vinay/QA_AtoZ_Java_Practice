package Java_I_Task;

import java.util.Arrays;

public class class84_Arrays {
    public static void main(String[] args) {
        //Sort the array → int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32};
        //
        //1,3,4,10,12,32,34,100
        //
        //without using any functions.
        //
        //Hint - compare and replace(temp)
        //i/p> int as numbers given o/p> int as second smallest number
        int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32};
        for (int i = 0; i < numbers.length; i++) {
            Arrays.sort(numbers);
            System.out.println(numbers[i]);
        }
    }


}



