package dev.adampeter.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    //we can name the test anything (don't have to include the word test) - we have to Annotate the test method
    @Test
    public void canAddZeroPlusZero() {
        Calculator calc = new Calculator();
        int sum = calc.add(0, 0);
        //Assertion of equality of expected and calculated values (+ error message)
        assertEquals(0, sum, "Was expecting sum of 0");
    }
}
