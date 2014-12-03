package problem.solving;

import org.junit.Test;
import static org.junit.Assert.*;

//import static junit.framework.Assert.*;

public class FactorialTest {
	@SuppressWarnings("deprecation")
	@Test
	// it is telling the method is a test case
	// n! = (n-m)! * (m+1) * (m+2) *... n
	// 10! = (10-5)! * 6 * 7 ..10 = 5! * 6 * 7.. 10= 120 * 6 * 7
	// 15! = (15-10)! * 11 *12...
	public void testFactorial() {

		Factorial number = new Factorial();
		assertEquals(120.0, number.calculateFactorial(5));
		assertEquals(3628800.0, number.calculateFactorial(10));
		assertEquals(1307674368000.0, number.calculateFactorial(15));

	}
}
