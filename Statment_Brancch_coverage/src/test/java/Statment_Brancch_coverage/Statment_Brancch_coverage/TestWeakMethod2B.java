package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestWeakMethod2B {

	@Test
	public void testa() {
	    int a = 15;  
	    int b = 3;   
	    int expected = a / b;
	    int actual = WeakClass.weakMethod2(a, b);

	    assertEquals(expected, actual);
	}
	@Test
	public void testb() {
	    int a = 15;  
	    int b = 6;   

	    int c = WeakClass.weakMethod2(a, b);

	    assertEquals(a / b, c);
	}
	@Test 
	public void testc() {
	    int a = 8;  
	    int b = 9;   

	    int c = WeakClass.weakMethod2(a, b);

	    assertEquals(a/b , c);
	}
	@Test 
	public void testd() {
	    int a = 8;  
	    int b = 8;   

	    int c = WeakClass.weakMethod2(a, b);

	    assertEquals(a/b , c);
	}
	

}

