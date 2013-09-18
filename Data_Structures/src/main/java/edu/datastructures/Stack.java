package edu.datastructures;

/**
 * In a stack, the element deleted from the set is the one most recently
 * inserted: the stack implements a last-in, first-out, or LIFO, policy.
 * 
 * @author kameshkarra
 * 
 */
public interface Stack {

	/**
	 * The INSERT operation on a stack is often called PUSH
	 * 
	 * @param item
	 */
	public void push(Object item);

	/**
	 * DELETE operation, which does not take an element argument, is often
	 * called POP
	 * 
	 * @return
	 */
	public Object pop();

}
