package java_B;

public class class18_TO_Largest_of_three_num {
    public static void main(String[] args) {
        //Finding the Largest of Three Numbers a,b,c using the Ternary Operator.
        //i/p and o/p >> 3 int as input >>largest number as output
        int n= 65, n2 = 99, n3= 87;
        //n> n2 >>n
        String result = n>n2 && n>n3? "n is the Largest number": (n2>n3? "n2 is the largest number": "n3 is the largest number");
        System.out.println(result);
    }
}
