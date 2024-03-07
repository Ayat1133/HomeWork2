package Statment_Brancch_coverage.Statment_Brancch_coverage;

import org.junit.Test;

public class TestWeakMethod1 {

    @Test(expected = java.lang.ArithmeticException.class)
    public void testDivisionByZero() {
        int a = 5;
        int b =0 ;

        WeakClass.weakMethod1(a, b);
    }
}

