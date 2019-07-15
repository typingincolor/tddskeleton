import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

@RunWith(Parameterized.class)
public class ParameterizedFizzBuzzTest {
    @Parameterized.Parameters(name = "Test {index}:  {0} returns {1}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1,"1"}, {2,"2"}, {3, "fizz"}, {5,"buzz"}, {6,"fizz"}, {10, "buzz"}, {15, "fizzbuzz"}
                }
        );
    }

    private int input;

    private String expected;

    public ParameterizedFizzBuzzTest(int input, String expected) {
        this.input = input;
        this.expected = expected;
    }

    @Test
    public void test() {
        assertThat(FizzBuzz.fizzBuzz(input), is(equalTo(expected)));
    }

}