package Statment_Brancch_coverage.Statment_Brancch_coverage;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestWeakMethod1B {

    @Test
    public void testDivision() {
        int a = 10;
        int b = 2;

        int result = WeakClass.weakMethod1(a, b);

        assertEquals(5, result);
    }

    @Test
    public void testNegative() {
        int a = 10;
        int b = -2;

        int result = WeakClass.weakMethod1(a, b);

        assertEquals(-5, result);
    }

    @Test
    public void testNonZero() {
        int a = 8;
        int b = 4;

        int result = WeakClass.weakMethod1(a, b);

        assertEquals(11, result);
    }


}
