package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestWeakMethod2B {

	@Test
	public void testa() {
	    int a = 15;  
	    int b = 3;   

	    int c = WeakClass.weakMethod2(a, b);

	    assertEquals(a / b, c);
	}
	@Test(expected = java.lang.ArithmeticException.class)
	public void testb() {
	    int a = 15;  
	    int b = 0;   

	    int c = WeakClass.weakMethod2(a, b);

	    assertEquals(a / b, c);
	}
	@Test (expected = java.lang.ArithmeticException.class)
	public void testc() {
	    int a = 8;  
	    int b = 0;   

	    int c = WeakClass.weakMethod2(a, b);

	    assertEquals(a +6 , c);
	}
	@Test 
	public void testd() {
	    int a = 8;  
	    int b = 8;   

	    int c = WeakClass.weakMethod2(a, b);

	    assertEquals(a/b , c);
	}
	

}

