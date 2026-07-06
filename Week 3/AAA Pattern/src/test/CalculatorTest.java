package com.example;

import org.junit.After;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
public class CalculatorTest {
    Calculator calculator;
    @Before
    public void setUp() {
        System.out.println("Setting up...");
        calculator = new Calculator();
    }
    @After
    public void tearDown() {
        System.out.println("Cleaning up...");
        calculator = null;
    }
    @Test
    public void testAddition() {
        int a = 10;
        int b = 20;
        int result = calculator.add(a, b);
        assertEquals(30, result);
    }
    @Test
    public void testSubtraction() {
        int a = 15;
        int b = 5;
        int result = calculator.subtract(a, b);

        assertEquals(10, result);
    }
    @Test
    public void testMultiplication() {
        int a = 6;
        int b = 7;
        int result = calculator.multiply(a, b);
        assertEquals(42, result);
    }
}
