package problem.solving;

import static org.junit.Assert.*;

import org.junit.Test;

public class SwapNumbersTest {

	@Test
	public void testSwap() {
		SwapNumbers number = new SwapNumbers();
		number.setA(3);
		number.setB(4);
		number.swap();
		assertEquals(4, number.getA());
		assertEquals(3, number.getB());
	}
}
