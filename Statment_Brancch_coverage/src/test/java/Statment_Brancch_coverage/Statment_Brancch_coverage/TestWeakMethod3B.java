package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestWeakMethod3B {

	@Test(expected = java.lang.ArithmeticException.class)
	public void zerotset() {
	    int a = 0;  
	    int b = 1;

	    int result = WeakClass.weakMethod3(a, b);

	    assertEquals(a , result);
	}
	@Test(expected = java.lang.ArithmeticException.class)
	public void testZeroeq() {
		int a = 0;  
	    int b = 0;

	    int result = WeakClass.weakMethod3(a, b);
		    assertEquals(b, result);
		}
	@Test
	public void bbigger() {
		int a = 5;  
	    int b = 15;

	    int result = WeakClass.weakMethod3(a, b);
	    assertEquals(b-a , result);
		}
	@Test
	public void tstzero() {
		int a = 1;  
	    int b = 0;

	    int result = WeakClass.weakMethod3(a, b);
	    assertEquals(0 , result);
		}
	@Test
	public void equalss() {
		int a = 10;  
	    int b = 10;

	    int result = WeakClass.weakMethod3(a, b);
	    assertEquals(b/a , result);
		}
	@Test
	public void aabig() {
		int a = 10;  
	    int b = 2;

	    int result = WeakClass.weakMethod3(a, b);
	    assertEquals(0 , result);
		}
	public void aaabig() {
		int a = 0;  
	    int b = -2;

	    int result = WeakClass.weakMethod3(a, b);
	    assertEquals(b/a , result);
		}
	@Test (expected = java.lang.ArithmeticException.class)
	public void testAEqualsZero() {
	    int a = 0;  
	    int b = 5;

	    int expectedResult = a - b;
	    int result = WeakClass.weakMethod3(a, b);

	    assertEquals(expectedResult, result);
	}
	

	@Test 
	public void testAIsZero() {
	    int a = 0;
	    int b = -5;

	    int expectedResult = a - b;
	    int result = WeakClass.weakMethod3(a, b);

	    assertEquals(expectedResult, result);
	}

	@Test (expected = java.lang.ArithmeticException.class)
	public void testAIsGreaterThanBAndAIsZero() {
	    int a = 0;
	    int b = 3;

	    int expectedResult = a - b;
	    int result = WeakClass.weakMethod3(a, b);

	    assertEquals(expectedResult, result);
	}


}
