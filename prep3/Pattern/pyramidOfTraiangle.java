package Pattern;

public class pyramidOfTraiangle {
    static void main() {
        int a = 5;
        for (int i = 1; i <= a; i++) {
            //printing spaces
            for (int j = 1; j < a - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
