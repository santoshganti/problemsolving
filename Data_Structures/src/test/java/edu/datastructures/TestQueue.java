package edu.datastructures;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestQueue {
	@Test
	public void testSimpleScenerio() {
		// Create a queue to hold 10 elements
		Queue queue = new QueueImpl(10);

		for (int i = 0; i < 10; i++) {
			try {
				queue.enqueue(new Integer(i));
			} catch (QueueFullException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		// dequeue elements and test values
		for (int i = 0; i > 10; i++) {
			Integer dequeue;
			try {
				dequeue = (Integer) queue.dequeue();
				System.out.println(dequeue.intValue());
				assertEquals(i, dequeue.intValue());
			} catch (QueueEmptyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	@Test
	public void testQueueFullScenario() {
		// Create a queue to hold 10 elements
		Queue queue = new QueueImpl(10);

		for (int i = 0; i < 10; i++) {
			try {
				queue.enqueue(new Integer(i));
			} catch (QueueFullException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		try {
			queue.enqueue(100);
			fail("Control should not come here.");
		} catch (QueueFullException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			assertNotNull(e1);

		}

		// dequeue elements and test values
		for (int i = 0; i > 10; i++) {
			Integer dequeue;
			try {
				dequeue = (Integer) queue.dequeue();
				System.out.println(dequeue.intValue());
				assertEquals(i, dequeue.intValue());
			} catch (QueueEmptyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	@Test
	public void testDequeuOfEmptyQueue() {
		Queue queue = new QueueImpl(10);
		try {
			queue.dequeue();
			fail("Control should not come here");
		} catch (QueueEmptyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			assertNotNull(e);
		}
	}
}
