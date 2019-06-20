import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class TestFizzBuzz {
    @Test
    public void get_one_when_I_pass_one() {
        assertThat("get 1 when I pass 1", FizzBuzz.fizzBuzz(1), is(equalTo("1")));
    }

    @Test
    public void get_two_when_I_pass_two() {
        assertThat("get 2 when I pass 2", FizzBuzz.fizzBuzz(2), is(equalTo("2")));
    }
}
