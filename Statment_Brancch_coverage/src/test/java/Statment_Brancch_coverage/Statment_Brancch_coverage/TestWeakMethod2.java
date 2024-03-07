package Statment_Brancch_coverage.Statment_Brancch_coverage;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestWeakMethod2 {


	@Test(expected = java.lang.ArithmeticException.class)
	public void testZero11() {
	    int a = 15;  
	    int b = 0;

	    int c = WeakClass.weakMethod2(a, b);

	    assertEquals(a/b, c);
	}


}
