package dev.adampeter.calculator;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Locale;

public class Calculator {

    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public int divide(int num1, int num2) {
        if (num2 != 0) {
            return num1 / num2;
        }
        return -1;
    }

    public String calcAnnuity(String R, int t, String r, int n) {
        NumberFormat moneyFormatter = NumberFormat.getCurrencyInstance(Locale.US);

        BigDecimal bigDecimalR = new BigDecimal(R);
        BigDecimal bigDecimalT = new BigDecimal(t);
        BigDecimal rate = new BigDecimal(r);
        BigDecimal bigDecimalN = new BigDecimal(n);

        BigDecimal rateDivN = rate.divide(bigDecimalN); //We don't need a MathContext in this example
        BigDecimal onePlusRateDivN = rateDivN.add(BigDecimal.valueOf(1));
        BigDecimal up = onePlusRateDivN.pow(bigDecimalN.multiply(bigDecimalT).intValue()).subtract(BigDecimal.valueOf(1));
        BigDecimal result = bigDecimalR.multiply((up.divide(rateDivN)));

        return moneyFormatter.format(result);
    }
}
