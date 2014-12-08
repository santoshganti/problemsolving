package edu.datastructures;

/**
 * We are writing an interface for Linked List Data Structure. Linked List Data
 * Structure has many implementations but this is doubly linked list.
 * 
 * @author santoshganti
 */
public interface LinkedList {
	/**
	 * Given an element "x" whose key attribute has been set the LIST INSERT
	 * procedure "Splices" x onto the front of the linked list.
	 * 
	 */
	public void insert(Object key) throws LinkedListFullException;

	/**
	 * Given an element "x" whose key attribute has been set the LIST DELETE
	 * procedure "Splices" x out of the list by updating pointers.
	 * 
	 * 
	 */
	public boolean delete(Object key);

	/**
	 * This is the size of the list.
	 * 
	 */
	public int size();

	/**
	 * Finds the first element in the list , by a simple linear search .
	 * 
	 */
	public Link search(Object key);
	/**
	 * Checks if the list is empty or not
	 */
	public boolean isEmpty();
	
	public Link getHead();
	
	public Link getTail();
}
