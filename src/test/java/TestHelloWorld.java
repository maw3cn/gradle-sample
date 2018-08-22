import org.apache.commons.collections4.IteratorUtils;
import org.junit.Test;

import java.util.Arrays;
import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class TestHelloWorld {

    @Test
    public void test() {
        assertThat(1, equalTo(1));

        Iterator<String> iter = Arrays.asList("1", "22", "3").iterator();
        assertTrue(IteratorUtils.matchesAll(iter, s -> s.length() >= 1));

        assertEquals("hello", "hello");

    }
}
