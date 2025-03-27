package dev.lidia.MyComponent;
import org.hamcrest.MatcherAssert;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class RnaTest {
    
    private DnaToRna dnaToRna = new DnaToRna(); 

    @Test
    @DisplayName ("testing dna to rna")
    public void dnaToRna() {
        String result = dnaToRna.equalRna ("GCTA");
        assertThat(result, is(equalTo("CGAU")));
    }
}
