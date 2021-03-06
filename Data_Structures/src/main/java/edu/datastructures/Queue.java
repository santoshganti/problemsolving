package edu.datastructures;

/**
 * In a Queue, the element deleted from the set is the one that entered first :
 * the queue implements a first-in, first-out, or FIFO, policy.
 * 
 * @author Santosh Ganti
 * 
 */
public interface Queue {
	/*
	 * Enqueue is a method of inserting elements into the queue at the rear end.
	 * Enqueue take item as the parameter. inserts object item at the rear end.
	 */
	public void enqueue(Object item) throws QueueFullException;

	/*
	 * Dequeue is the method of removing elements from the queue i.e the front
	 * element. an error occurs if queue is empty ! We flag the error using
	 * exceptions. Removes item from the front end.
	 */
	public Object dequeue() throws QueueEmptyException;
	/*
	 * isEmpty method checks if the queue is empty or not 
	 * 
	 */
	public boolean isEmpty();
	/*
	 * Max size of the queue
	 */
	public int size();
}
