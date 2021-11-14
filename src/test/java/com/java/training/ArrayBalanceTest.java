package com.java.training;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ArrayBalanceTest {
    private ArrayBalance subject;
    private int[] array;
    private boolean expectedCanBalance;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{}, false},   // согласен
                {new int[]{1}, false},  // согласен
                {new int[]{1, 1}, true}, // согласен
                {new int[]{1, 2}, false}, // согласен
                {new int[]{1, 1, 2}, true}, // допустим согласен 1+1=2
                {new int[]{1, 2, 2}, false},// согласен
                {new int[]{1, 2, 3}, true},// допустим согласен 1+2=3
                {new int[]{33, 33, 1, 2, 1}, false},// согласен
                {new int[]{1, 1, 1, 2, 1}, true},// допустим согласен 1+1+1=2+1
                {new int[]{3, 4, -1, 6}, true},//  а тут как?  3+4= 6-1   ????
                // Есди я правильно понял задание, то если первая часть массива = второй части возвращаем тру
        });
    }

    public ArrayBalanceTest(int[] array, boolean expectedCanBalance) {
        this.array = array;
        this.expectedCanBalance = expectedCanBalance;
        this.subject = new ArrayBalance();
    }

    @Test
    public void testCanBalance() {
        Assert.assertEquals("Invalid result for: " + Arrays.toString(array), expectedCanBalance, subject.canBalance(array));
    }
}
