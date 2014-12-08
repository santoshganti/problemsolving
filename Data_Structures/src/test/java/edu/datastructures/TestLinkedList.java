package edu.datastructures;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestLinkedList {
	@Test
	public void testInsert() throws Exception {
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

	}

	@Test
	public void testInsertWhenListIsFull() throws Exception {
		LinkedList linkedlist = createList();
		try {
			linkedlist.insert(200);
			fail("Insert Method failed because list is full and exception is not raised");
		} catch (LinkedListFullException e) {
			assertNotNull(e);
		}
	}

	@Test
	public void testSearch() throws Exception {
		LinkedList linkedlist = createList();
		Link link = null;
		for (int i = 0; i < 10; i++) {
			link = linkedlist.search(i);
			assertNotNull(link);
			assertEquals(i, link.getKey());
		}

		link = linkedlist.search(16);
		assertNull(link);

	}

	@Test
	public void testDelete() throws Exception {
		LinkedList linkedlist = createList();
		int listSize = linkedlist.size();
		assertEquals(10, listSize);
		Link returnedLink = linkedlist.search(4);
		assertNotNull(returnedLink);
		assertEquals(4, returnedLink.getKey());
		boolean deletedLink = linkedlist.delete(4);
		assertTrue(deletedLink);
		returnedLink = linkedlist.search(4);
		assertNull(returnedLink);
		listSize = linkedlist.size();
		assertEquals(9, listSize);

	}

	@Test
	public void testDeleteTailElement() throws Exception {
		LinkedList linkedlist = createList();
		int listSize = linkedlist.size();
		assertEquals(10, listSize);
		Link returnedLink = linkedlist.search(0);
		assertNotNull(returnedLink);
		assertEquals(0, returnedLink.getKey());
		boolean deletedLink = linkedlist.delete(0);
		assertTrue(deletedLink);
		returnedLink = linkedlist.search(0);
		assertNull(returnedLink);
		listSize = linkedlist.size();
		assertEquals(9, listSize);

	}

	@Test
	public void testDeleteHeadElement() throws Exception {
		LinkedList linkedlist = createList();
		int listSize = linkedlist.size();
		assertEquals(10, listSize);
		Link returnedLink = linkedlist.search(9);
		assertNotNull(returnedLink);
		assertEquals(9, returnedLink.getKey());
		boolean deletedLink = linkedlist.delete(9);
		assertTrue(deletedLink);
		returnedLink = linkedlist.search(9);
		assertNull(returnedLink);
		listSize = linkedlist.size();
		assertEquals(9, listSize);

	}

	private LinkedList createList() throws LinkedListFullException {
		LinkedList linkedlist = new LinkedListImpl(10);
		for (int i = 0; i < 10; i++) {
			linkedlist.insert(i);
		}
		return linkedlist;
	}

	@Test
	public void testSearchWithDuplicateElements() throws Exception {
		LinkedList linkedlist = new LinkedListImpl(10);
		for (int i = 0; i < 5; i++) {
			linkedlist.insert(i);
		}
		for (int i = 0; i < 5; i++) {
			linkedlist.insert(i);
		}
		int listSize = linkedlist.size();
		assertEquals(10, listSize);
		Link returnedLink = linkedlist.search(4);
		assertNotNull(returnedLink);
		assertEquals(4, returnedLink.getKey());
		boolean deletedLink = linkedlist.delete(4);
		assertTrue(deletedLink);
		returnedLink = linkedlist.search(4);
		assertNotNull(returnedLink);
		listSize = linkedlist.size();
		assertEquals(9, listSize);
	}

}
