package dev.adampeter.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    private Calculator calc;

    @BeforeEach
    void setUp() {
        calc = new Calculator();
    }

    //ADD
    @Test
    public void canAddZeroPlusZero() {
        int sum = calc.add(0, 0);
        //Assertion of equality of expected and calculated values (+ error message)
        assertEquals(0, sum, "Was expecting sum of 0");
    }

    @Test
    public void canAddOnePlusOne() {
        int sum = calc.add(1, 1);
        assertEquals(2, sum);
    }

    @Test()
    @Disabled // or @Ignore (earlier version) - means we don't want to delete the test but also don't want to fix it now
    public void canAddMaxIntPlusOne() {
        int sum = calc.add(Integer.MAX_VALUE, 1);
        assertEquals(Integer.MAX_VALUE + 1L, sum);
    }

    @Test
    public void canAddNegativeNumbers() {
        int sum = calc.add(0, -1);
        assertEquals(-1, sum);
    }

    //SUBTRACT
    @Test
    public void subtractZero() {
        int diff = calc.subtract(0, 0);
        assertEquals(0, diff);
    }

    @Test
    public void subtractOne() {
        int diff = calc.subtract(0, 1);
        assertEquals(-1, diff);
    }

    @Test
    public void subtractNegative() {
        int diff = calc.subtract(0, -1);
        assertEquals(1, diff);
    }

    //MULTIPLY
    @Test
    public void multiplyByZero() {
        int result = calc.multiply(0, 0);
        assertEquals(0, result);
    }

    @Test
    public void multiplyByTwo() {
        int result = calc.multiply(5, 2);
        assertEquals(10, result);
    }

    @Test
    public void multiplyByNegative() {
        int result = calc.multiply(5, -2);
        assertEquals(-10, result);
    }

    //DIVIDE
    @Test
    public void divideByZero() {
        int result = calc.divide(1, 0);
        assertEquals(-1, result);
    }

    @Test
    public void divideByPositive() {
        int result = calc.divide(2, 2);
        assertEquals(1, result);
    }

    @Test
    public void divideByNegative() {
        int diff = calc.multiply(8, -2);
        assertEquals(-16, diff);
    }

    @Test
    public void annuityExample() {
        String answer = calc.calcAnnuity("22000", 7, ".06", 1);
        assertEquals("$184,664.43", answer);
    }

    @Test
    public void annuityPractice2() {
        String answer = calc.calcAnnuity("1200", 10, ".08", 4);
        assertEquals("$72,482.38", answer);
    }
}
