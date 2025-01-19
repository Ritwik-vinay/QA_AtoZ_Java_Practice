package java_B;

public class class17_TernaryOp {
    public static void main(String[] args) {
        //Write a program that calculates
        // and displays the letter grade for a given numerical score
        // (e.g., A, B, C, D, or F) based on the following grading scale:
        //O/p & i/p >> Display Grade and grades as input
        int i=90;
        String result = i>=90 && i<=100 ? "A": (i>=80 && i<= 89 ? "B": (i>= 70 && i<= 79) ? "C":(i>=60 && i<= 69 ? "D": "f") );
        System.out.println(result);
    }
}
