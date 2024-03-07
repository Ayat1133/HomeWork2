package Statment_Brancch_coverage.Statment_Brancch_coverage;
import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class TestWeakMethod4A {

    @Test
    public void testWeakMethod4WithNonZeroDenominator() {
        assertEquals(5, WeakClass.weakMethod4(10, 2));
    }

    @Test
    public void testWeakMethod4WithZeroDenominator() {
        assertEquals(-1, WeakClass.weakMethod4(10, 0));
    }
}



