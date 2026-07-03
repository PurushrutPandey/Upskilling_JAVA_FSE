package com.example;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class CalculatorTest {
     @Test
    public void testAddition() {

        Calculator calc = new Calculator();

        assertEquals(8, calc.add(5,3));

    }
}

