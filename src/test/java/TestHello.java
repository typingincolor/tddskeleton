import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TestHello {
    @Test
    public void testItSaysHelloBack() {
        HelloWorld hello = new HelloWorld();

        assertThat(hello.hello(),equalTo("hello"));
    }
}
