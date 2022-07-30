package com.company.module10;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase {
    private Calculator calc;

    protected void setUp() throws Exception {
        super.setUp();
        calc = new Calculator();
    }

    protected void tearDown() throws Exception {
        calc = null;
        super.tearDown();
    }

    public void testAdd() {

        int a = 5;
        int b = 20;
        int c = 1;

        assertEquals(25d, (calc.add(a, b)));
        assertEquals(25d, (calc.add(b, a)));

        a = -5;
        b = 20;

        assertEquals(15d, (calc.add(a, b)));
        assertEquals(15d, (calc.add(b, a)));

        a = -5;
        b = -20;

        assertEquals(-25d, (calc.add(a, b)));
        assertEquals(-25d, (calc.add(b, a)));

        a = 5;
        b = 20;

        assertEquals(26d, (calc.add(a, b, c)));
        assertEquals(26d, (calc.add(c, b, a)));

        a = -5;
        b = -20;
        c = -1;

        assertEquals(-26d, (calc.add(a, b, c)));
        assertEquals(-26d, (calc.add(c, b, a)));

    }

    public void testSubstract() {

        int a = 4;
        int b = 3;

        assertEquals(1d, (calc.substract(a, b)));
        assertEquals(-1d, (calc.substract(b, a)));

        a = 6;
        b = -3;

        assertEquals(9d, (calc.substract(a, b)));
        assertEquals(-9d, (calc.substract(b, a)));

        a = -15;
        b = -10;

        assertEquals(-5d, (calc.substract(a, b)));
        assertEquals(5d, (calc.substract(b, a)));
    }

    public void testMultiply() throws CustomException {

        double a = 5;
        double b = 10;

        assertEquals(50.0d, (calc.multiply(a, b)));
        assertEquals(50.0d, (calc.multiply(b, a)));

        a = -5;
        b = 10;

        assertEquals(-50.0d, (calc.multiply(a, b)));
        assertEquals(-50.0d, (calc.multiply(b, a)));

        a = -3;
        b = -10;

        assertEquals(30.0d, (calc.multiply(a, b)));
        assertEquals(30.0d, (calc.multiply(b, a)));
    }

    public void testDivide() {

        double a = 10;
        double b = 5;

        assertEquals(2.0d, (calc.divide(a, b)));
        assertEquals(0.5d, (calc.divide(b, a)));

        a = 9;
        b = -3;

        assertEquals(-3.0d, (calc.divide(a, b)));
        assertEquals(-0.33d, (calc.divide(b, a)));

        a = -10;
        b = -5;

        assertEquals(2d, (calc.divide(a, b)));
        assertEquals(0.5d, (calc.divide(b, a)));
    }

    public void testThrowException() {

        try {

            calc.add(2, 1);
            calc.substract(3, 3);
            calc.divide(0, 1);
            new Calculator();

        } catch (Exception e) {
            fail();
        }
    }
}

