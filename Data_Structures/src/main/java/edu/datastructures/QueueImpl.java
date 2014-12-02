package edu.datastructures;

/*
 * Array Implementation of queue ! Actually circular array implementation of queue! 
 * front and rear variables point to the obvious.
 * 
 * @author: Santosh Ganti
 */
public class QueueImpl implements Queue {
	private Object queue[];// Array "queue" holds the elements of the queue
	private int front;// the front element of the queue
	private int rear;// The rear element of the queue
	private int N;// Maximum capacity of the queue

	/*
	 * Constructor to create and initialize objects also define intial front and
	 * rear variables
	 */

	public QueueImpl(int size) {
		N = size+1;
		queue = new Object[N];
		rear = front = 0; 
	}

	/*
	 * Method to add items onto the queue
	 */
	public void enqueue(Object item) throws QueueFullException {
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
	public Object dequeue() throws QueueEmptyException {
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
		return (N - front + rear) % N;

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