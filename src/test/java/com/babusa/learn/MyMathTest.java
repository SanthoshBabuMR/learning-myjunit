package com.babusa.learn;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MyMathTest {
    private int inputA;
    private int inputB;
    private MyMath myMath = null;

    @Before
    public void setUp() {
        myMath = new MyMath();
        inputA = 3;
        inputB = 7;
    }

    @Test
    public void testSumWillPass () {
        int actual = myMath.sum(inputA, inputB);
        int expected = 10;
        Assert.assertEquals("actual mismatch with expected value", expected, actual);
    }

    @Test
    public void testSumWillFail () {
        int actual = myMath.sum(inputA, inputB);
        int expected = 0;
        Assert.assertEquals("actual mismatch with expected value", expected, actual);
    }

}
