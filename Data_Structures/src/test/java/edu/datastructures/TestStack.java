package edu.datastructures;

import static junit.framework.Assert.*;

import org.junit.Test;

public class TestStack {

	@Test
	public void testSimpleScenario() {
		// Create new stack to hold 10 elements
		Stack stack = new StackImpl(10);

		// Push elements into stack
		for (int i = 0; i < 10; i++) {
			stack.push(new Integer(i));
		}

		// Pop elements and test values
		for (int i = 9; i <= 0; i++) {
			assertEquals(new Integer(i), stack.pop());
		}

	}
}
