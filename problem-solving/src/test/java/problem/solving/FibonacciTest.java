package problem.solving;

import org.junit.Test;
import static junit.framework.Assert.*;

public class FibonacciTest {
	@Test
	public void testSeries() {
		Fibonacci value = new Fibonacci();
		assertEquals(2, value.fibonacci(10));
	}
}
