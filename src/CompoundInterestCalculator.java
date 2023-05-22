import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;

public class CompoundInterestCalculator {

    private static final NumberFormat moneyFormatter = NumberFormat.getCurrencyInstance();
    private static final NumberFormat percentageFormatter = NumberFormat.getPercentInstance();

    /**
     * Calculate the interest rate using this formula:
     * Balance(Y) = P(1+r)^Y + c[((1+r)^Y - 1) / r]
     *
     * @param principal    starting principal [money]
     * @param rate         rate of interest [%]
     * @param timePeriod   year [int]
     * @param contribution yearly contribution [money]
     * @return balance
     */
    public static BigDecimal calculate(String principal, String rate, int timePeriod, String contribution) throws ParseException {
        String formattedPrincipal = moneyFormatter.parse(principal).toString(); //moneyFormatter.parse() -> converts String of currency into a number
        String formattedRate = percentageFormatter.parse(rate).toString();
        String formattedContribution = moneyFormatter.parse(contribution).toString();

        BigDecimal a = BigDecimal.ONE.add(new BigDecimal(formattedRate)).pow(timePeriod); // (1+r)^Y
        BigDecimal b = a.subtract(BigDecimal.ONE); // ((1+r)^Y - 1)
        BigDecimal c = b.divide(new BigDecimal(formattedRate), new MathContext(5, RoundingMode.HALF_UP)); // ((1+r)^Y - 1) / r
        BigDecimal d = c.multiply(new BigDecimal(formattedContribution)); // c[((1+r)^Y - 1) / r]

        BigDecimal e = a.multiply(new BigDecimal(formattedPrincipal)); //P(1+r)^Y

        BigDecimal f = e.add(d);

        return f;
    }

    public static void main(String[] args) throws ParseException {
        BigDecimal balance = calculate("CZK10,000.00", "8%", 10, "CZK1,000.00");
        System.out.println(balance);
        System.out.println(moneyFormatter.format(balance));
    }
}
