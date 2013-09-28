package edu.datastructures;

/*
 * Array Implementation of queue ! Actually circular array implementation of queue! 
 * front and rear variables point to the obvious.
 * 
 * @author: Santosh Ganti
 */
public class QueueImpl implements Queue {
	private Object queue[];
	private int front, rear, N;

	/*
	 * Constructor to create and initialize objects also define intial front and
	 * rear variables
	 */

	public QueueImpl(int size) {
		queue = new Object[size];
		rear = front = -1;
	}

	/*
	 * Method to add items onto the queue
	 */
	public void enqueue(Object item) {
		if (size() == N - 1)
			throw new QueueFullException();
		else
			queue[rear] = item;
		rear = ((rear + 1) % N);

	}

	/*
	 * Method to remove object from the front of the queue; an error occurs if
	 * queue is empty, we raise an exception then QueueEmptyException
	 */
	public Object dequeue() {
		Object elem;
		if (isEmpty())
			throw new QueueEmptyException();
		else
			elem = queue[front];
		queue[front] = 0;
		front = ((front + 1) % N);
		return elem;
	}

	/*
	 * this is a support method defined to determine the size of queue and use
	 * it in our algorithm
	 */
	public int size() {
		return ((N - front + rear) % N);

	}

	/*
	 * This is another support method ! It checks the queue if its empty or not!
	 * Can be used in complex enqueuing and dequeueing operations
	 */
	public boolean isEmpty() {
		if (front == rear)
			return true;
		else
			return false;
	}
}