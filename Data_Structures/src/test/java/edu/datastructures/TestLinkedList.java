package edu.datastructures;

import org.junit.Test;
import static junit.framework.Assert.*;

public class TestLinkedList {
	@Test
	public void testInsert() {
		LinkedList linkedlist = new LinkedListImpl(10);
		assertEquals(0, linkedlist.size());
		assertNull(linkedlist.getHead());
		assertNull(linkedlist.getTail());
		linkedlist.insert(1);
		assertEquals(1, linkedlist.size());
		assertEquals(1, linkedlist.getHead().getKey());
		assertEquals(1, linkedlist.getTail().getKey());
		linkedlist.insert(4);
		assertEquals(2, linkedlist.size());
		assertEquals(4, linkedlist.getHead().getKey());
		assertEquals(1, linkedlist.getTail().getKey());
		linkedlist.insert(16);
		assertEquals(3, linkedlist.size());
		assertEquals(16, linkedlist.getHead().getKey());
		assertEquals(1, linkedlist.getTail().getKey());
		linkedlist.insert(9);
		assertEquals(4, linkedlist.size());
		assertEquals(9, linkedlist.getHead().getKey());
		assertEquals(1, linkedlist.getTail().getKey());
		/**
		 * Deletion starts here
		 */
		linkedlist.delete(4);
	}
}
