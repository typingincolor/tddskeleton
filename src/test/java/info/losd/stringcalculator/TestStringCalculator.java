package info.losd.stringcalculator;

import org.junit.Test;
import static info.losd.stringcalculator.Calculator.add;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TestStringCalculator {
    @Test
    public void test_i_can_call_it() {
        add("");
    }

    @Test(expected = RuntimeException.class)
    public void when_more_than_2_numbers_then_exception_is_thrown() {
        add("1,2,3");
    }

    @Test
    public void returns_zero_for_empty_string() {
        assertThat(add(""), is(equalTo(0)));
    }

    @Test(expected = RuntimeException.class)
    public void when_invalid_number_then_exception_is_thrown() {
        add("1,x");
    }
}
