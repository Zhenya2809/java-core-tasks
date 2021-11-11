package com.java.training;

import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {
    private static int ZERO = 0;
    private static int ONE = 1;
    private static int SEVEN = 7;

    @Test
    public void getFactorialFromZero() {
        Factorial factorial = new Factorial();
        int actualResult = factorial.getFactorial(ZERO);
        int expectedResult = 1;

        Assert.assertEquals("Test failed with actual result " + actualResult,
                expectedResult,
                actualResult);
    }

    @Test
    public void getFactorialFromOne() {
        Factorial factorial = new Factorial();
        int actualResult = factorial.getFactorial(ONE);
        int expectedResult = 1;

        Assert.assertEquals("Test failed with actual result " + actualResult,
                expectedResult,
                actualResult);
    }

    @Test
    public void getFactorialFromSeven() {
        Factorial factorial = new Factorial();
        int actualResult = factorial.getFactorial(SEVEN);
        int expectedResult = 5040;

        Assert.assertEquals("Test failed with actual result " + actualResult,
                expectedResult,
                actualResult);
    }
}
