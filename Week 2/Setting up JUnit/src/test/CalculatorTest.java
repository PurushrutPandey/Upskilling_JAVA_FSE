package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testAddition() {

        Calculator calc = new Calculator();

        int result = calc.add(5, 3);

        System.out.println("5 + 3 = " + result);

        assertEquals(8, result);
    }
}
