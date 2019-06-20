import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class TestFizzBuzz {
    @Test
    public void get_one_when_I_pass_one() {
        assertThat("get 1 when I pass 1", FizzBuzz.fizzBuzz(1), is(equalTo("1")));
    }
}
