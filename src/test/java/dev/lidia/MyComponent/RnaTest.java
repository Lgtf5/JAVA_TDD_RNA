package dev.lidia.MyComponent;
import org.hamcrest.MatcherAssert;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class RnaTest {
    @Test
    @DisplayName ("first test")
    public void testInit() {
        MatcherAssert.assertThat(1, is(1));
    }
}
