import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.Random;

public class Numbers {
    private static Random random = new Random();
    private static NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(Locale.US);
    private static MathContext mc = new MathContext(5, RoundingMode.HALF_UP);
    private int randomNumbers = 0;

    public void nextRandom() {
        int n = random.nextInt(10);
        System.out.printf("Random: %d%n", n);
        randomNumbers += n;
        System.out.printf("Total: %d%n", randomNumbers);
    }

    public String getCurrency(String ammount) {
        return currencyFormatter.format(new BigDecimal(ammount));
    }

    public String divideAndFormat(String money) throws ParseException {
        BigDecimal formatted = new BigDecimal(currencyFormatter.parse(money).toString());
        BigDecimal divided = formatted.divide(new BigDecimal("32.19"), mc);
        return currencyFormatter.format(divided);
    }

    public static void main(String[] args) throws ParseException {
        Numbers n = new Numbers();
        for (int i = 0; i < 10; i++) {
            n.nextRandom();
        }

        System.out.println();
        System.out.println(n.getCurrency("149.32"));

        System.out.println();
        System.out.println(n.divideAndFormat("$12,345.83"));
    }
}
