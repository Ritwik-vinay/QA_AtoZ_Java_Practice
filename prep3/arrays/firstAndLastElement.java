package arrays;

public class firstAndLastElement {
    static void main() {
        //Find first and last element in the array
        String[] fruits = {"Apple", "Banana", "Papaya", "Orange"};
        String firstElement = fruits[0];
        String lastElemenet = fruits[fruits.length - 1];

        System.out.println("First Element is : " + firstElement);
        System.out.println("Last Element is: " + lastElemenet);
    }
}
