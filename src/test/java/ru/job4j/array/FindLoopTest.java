package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class FindLoopTest {
    @Test
    public void whenArrayHas5Then0() {
        int[] data = {5, 4, 3, 2};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHas7Then3() {
        int[] data = {2, 5, 3, 7, 19, 42};
        int el = 7;
        int result = FindLoop.indexOf(data, el);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHas777ThenMinus1() {
        int[] data = {8, 2, 4, 42, 99, 73};
        int el = 777;
        int result = FindLoop.indexOf(data, el);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenFind2() {
        int[] data = {5, 4, 3, 2, 0, 9, 6, 1, 2, 33, 77};
        int el = 2;
        int start = 4;
        int finish = 8;
        int result = FindLoop.indexOf(data, el, start, finish);
        int expected = 8;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenFind8() {
        int[] data = {8, 2, 4, 42, 99, 73};
        int el = 8;
        int start = 3;
        int finish = 5;
        int result = FindLoop.indexOf(data, el, start, finish);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }
}