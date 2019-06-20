import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class TestFizzBuzz {

    private void checkFizzBuzz(int value, String expected) {
        assertThat(FizzBuzz.fizzBuzz(value), is(equalTo(expected)));
    }

    @Test
    public void get_one_when_I_pass_one() {
        checkFizzBuzz(1, "1");
    }

    @Test
    public void get_two_when_I_pass_two() {
       checkFizzBuzz(2, "2");
    }

    @Test
    public void get_fizz_when_I_pass_3() {
        checkFizzBuzz(3, "fizz");
    }
}
