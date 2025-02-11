package Java_I_Task;

public class class84_Arrays {
    public static void main(String[] args) {
        //Sort the array → int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32};
        //
        //1,3,4,10,12,32,34,100
        //
        //without using any functions.
        //
        //Hint - compare and replace(temp)
        int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32};
        for (int i = 0; i < numbers.length - 1; i++) {//loop starts
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        for (int num : numbers) {
            System.out.print(num + " ");

        }
    }


}



