package Java_I_Task;

import java.util.Arrays;

public class class85_Arrays {
    public static void main(String[] args) {
        //Second smallest number  in any array.
        int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32};
        for (int i = 0; i < numbers.length; i++) {
            Arrays.sort(numbers);
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.println("Second smallest number is " + numbers[1]);

    }

}
