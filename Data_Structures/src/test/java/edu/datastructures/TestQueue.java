package edu.datastructures;
import static junit.framework.Assert.*;

import org.junit.Test;

public class TestQueue {
	@Test
	public void testSimpleScenerio(){
		//Create a queue to hold 10 elements
		Queue queue = new QueueImpl(10);
		// Push elements into stack
		/*
		 * 9
		 * 8
		 * 7
		 * 6
		 * 5
		 * 4
		 * 3
		 * 2
		 * 1
		 * 0
		 */
		for (int i = 0; i < 10; i++) {
			queue.enqueue(new Integer(i));
		}

		// dequeue elements and test values
		for (int i = 9; i >= 0; i--) {
			Integer dequeue = (Integer) queue.dequeue();
			System.out.println(dequeue.intValue());
			assertEquals(i, dequeue.intValue());
		}

	}
}

