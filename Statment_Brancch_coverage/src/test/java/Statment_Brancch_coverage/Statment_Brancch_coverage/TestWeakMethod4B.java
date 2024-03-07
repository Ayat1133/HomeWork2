package Statment_Brancch_coverage.Statment_Brancch_coverage;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestWeakMethod4B {

    @Test
    public void testWeakMethod4WithNonZeroDenominator() {
        assertEquals(2, WeakClass.weakMethod4(4, 2));
    }

    @Test
    public void testWeakMethod4WithZeroDenominator() {
        assertEquals(-1, WeakClass.weakMethod4(5, 0));
    }

    @Test
    public void testWeakMethod4WithNegativeDenominator() {
        assertEquals(-5, WeakClass.weakMethod4(10, -2));
    }
}


