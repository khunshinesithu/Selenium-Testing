import java.math.BigInteger;

public class Factorial {
    public static void main(String[] args) {
        final int NUM = 100;
        for (int i = 0; i < NUM; i++) {
            System.out.println(i + "! = " + factorial(i));
        }
    }

    public static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
