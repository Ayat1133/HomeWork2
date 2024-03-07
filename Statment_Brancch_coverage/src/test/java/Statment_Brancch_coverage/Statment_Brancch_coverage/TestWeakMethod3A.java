package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestWeakMethod3A {

    @Test
    public void testBiggerA() {
        int a = 5;  
        int b = 3;

        int result = WeakClass.weakMethod3(a, b);

        assertEquals(0, result);
    }

    @Test
    public void testEqualValues() {
        int a = 5;  
        int b = 5;

        int result = WeakClass.weakMethod3(a, b);

        assertEquals(1, result);
    }

    @Test
    public void BbiggerthanA() {
        int a = 3;  
        int b = 5;

        int result = WeakClass.weakMethod3(a, b);
        assertEquals(2 , result);
    }
}