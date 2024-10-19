import java.math.BigInteger;

public class StringMultiplication {
    public static String multiply(String num1, String num2) {
        BigInteger n1 = new BigInteger(num1);
        BigInteger n2 = new BigInteger(num2);
        BigInteger product = n1.multiply(n2);
        return product.toString();
    }

    public static void main(String[] args) {
        String num1 = "123";
        String num2 = "456";
        System.out.println("Product: " + multiply(num1, num2));
    }
}
