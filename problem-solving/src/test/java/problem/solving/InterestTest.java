package problem.solving;

import org.junit.Test;

import static org.junit.Assert.*;

public class InterestTest {

	public void testSimpleInterest() {
		Interest value = createInterest();
		value.simpleInterest();
		assertEquals(5.0, value.getInterest(), 0.001);
	}

	private Interest createInterest() {
		Interest value = new Interest();
		value.setPrincipal(100.0);
		value.setRate(5);
		value.setTimeInYears(1);
		return value;
	}

	@Test
	public void testCompoundInterest() {
		Interest value = createInterest();
		value.compoundInterest(CompoundInterval.HALF_YEARLY);
		assertEquals(5.06, value.getInterest(), 0.01);
	}

	@Test
	public void testContinousCompoundInterest() {
		Interest value = createInterest();
		value.continousCompoundInterest();
		assertEquals(105.13, value.getInterest(), 0.01);

	}
}
