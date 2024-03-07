package Statment_Brancch_coverage.Statment_Brancch_coverage;
import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class TestWeakMethod4A {

    @Test
    public void testWeakMethod4WithNonzero() {
        int a = 10;  
        int b = 2;

        int c = WeakClass.weakMethod4(a, b);

        assertEquals(5, c);
    }

    @Test
    public void testWeakMethod4WithZero() {
        int a = 10;  
        int b = 0 ;

        int c = WeakClass.weakMethod4(a, b);

        assertEquals(-1, c);
    }
}



