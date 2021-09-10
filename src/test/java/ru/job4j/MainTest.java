package ru.job4j;

import org.junit.Test; //не находит junit
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MainTest {
    @Test
    public void whenActionThenResult() {
        int excepted = 1;
        int result = 1;
        assertThat(result, is(excepted));
    }
}
