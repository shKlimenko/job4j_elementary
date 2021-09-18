package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class CounterTest {
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumEvenNumbersFrom22To77Then1372() {
        int start = 22;
        int finish = 77;
        int result = Counter.sumByEven(start, finish);
        int expected = 1372;
        Assert.assertEquals(expected, result);
    }
}