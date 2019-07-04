package info.losd.stringcalculator;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static info.losd.stringcalculator.Calculator.add;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TestStringCalculator {
    @Test
    public void returns_zero_for_empty_string() {
        assertThat(add(""), is(equalTo(0)));
    }

    @Test(expected = RuntimeException.class)
    public void when_invalid_number_then_exception_is_thrown() {
        add("1,x");
    }

    @Test
    public void when_one_number_passed_number_is_returned() {
        assertThat(add("12"), is(equalTo(12)));
    }

    @Test
    public void when_two_numbers_passed_sum_is_returned() {
        assertThat(add("1,2"), is(equalTo(3)));
    }

    @Test
    public void can_handle_adding_multiple_numbers() {
        assertThat(add("1,2,3,4,5"), is(equalTo(1 + 2 + 3 + 4 + 5)));
    }

    @Test
    public void can_use_newline_as_a_delimiter() {
        assertThat(add("1\n2,3"), is(equalTo(1+2+3)));
    }

    @Test
    public void when_delimiter_is_specified_then_use_it() {
        assertThat(add("//;\n1;2"), is(equalTo(1+2)));
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void do_not_allow_negative_numbers() {
        thrown.expect(RuntimeException.class);
        thrown.expectMessage("Negative numbers not allowed: -1 -2");

        add("1,-1,2,-2");
    }
}
