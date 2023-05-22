import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;

public class MathStuff {
    public static void main(String[] args) {
        BigDecimal num1 = new BigDecimal("1024");

        double d1 = num1.doubleValue();
        String myBigDecimalString = num1.toString();

        BigInteger myBigInt = new BigInteger("12345678901234567890");
        System.out.println(myBigInt);
    }
}