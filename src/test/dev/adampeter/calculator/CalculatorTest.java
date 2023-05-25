package dev.adampeter.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    private Calculator calc;

    @BeforeEach
    void setUp() {
        calc = new Calculator();
    }

    //we can name the test anything (don't have to include the word test) - we have to Annotate the test method
    public
    @Test void canAddZeroPlusZero() {
        int sum = calc.add(0, 0);
        //Assertion of equality of expected and calculated values (+ error message)
        assertEquals(0, sum, "Was expecting sum of 0");
    }

    public
    @Test void canAddOnePlusOne() {
        int sum = calc.add(1, 1);
        assertEquals(2, sum);
    }

    public
    @Test void canAddNegativeNumbers() {
        int sum = calc.add(0, -1);
        assertEquals(-1, sum);
    }
}
