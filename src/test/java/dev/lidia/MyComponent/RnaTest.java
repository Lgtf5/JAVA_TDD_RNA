package dev.lidia.MyComponent;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.hamcrest.MatcherAssert;
import static org.hamcrest.Matchers.is;


public class RnaTest {
    @Test
    
    public void testInit() {
        MatcherAssert.assertThat(1, is("Rna"));
    }
}
