import java.math.BigInteger;

public class factorialBigInteger {
    public static void main(String[] args) {
        int x = 50;
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= x; i++) {
            result = result.multiply(BigInteger.valueOf(i));

        }
        System.out.println(result);

    }


}

